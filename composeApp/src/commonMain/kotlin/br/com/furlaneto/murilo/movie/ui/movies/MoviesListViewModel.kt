package br.com.furlaneto.murilo.movie.ui.movies

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.furlaneto.murilo.movie.data.network.repository.MoviesRepository
import br.com.furlaneto.murilo.movie.domain.model.MovieSection
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class MoviesListViewModel(
    private val moviesRepository: MoviesRepository

) : ViewModel(){

    private val _moviesListState = MutableStateFlow<MovieListState>(MovieListState.Loading)
    val moviesListState = _moviesListState.asStateFlow()

    init{
        getMoviesSections()
    }

    private fun getMoviesSections(){
        viewModelScope.launch {
            try{
                val moviesSections = moviesRepository.getMovieSections()
                _moviesListState.update { MovieListState.Success(moviesSections) }
            } catch (e: Exception){
                _moviesListState.update{
                    MovieListState.Error(e.message ?: "Unknown error")
                }
            }
        }
    }



    sealed interface  MovieListState{
        data object Loading: MovieListState
        data class Success(val moviesSection: List<MovieSection>): MovieListState
        data class Error(val message: String): MovieListState

    }
}