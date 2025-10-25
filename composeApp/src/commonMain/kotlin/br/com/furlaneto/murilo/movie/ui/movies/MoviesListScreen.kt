package br.com.furlaneto.murilo.movie.ui.components.movies

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import br.com.furlaneto.murilo.movie.data.network.IMAGE_SMALL_BASE_URL
import br.com.furlaneto.murilo.movie.data.network.KtorClient
import br.com.furlaneto.murilo.movie.data.repository.MoviesRepository
import br.com.furlaneto.murilo.movie.domain.model.Movie
import br.com.furlaneto.murilo.movie.domain.model.MovieSection
import br.com.furlaneto.murilo.movie.domain.model.movie1
import br.com.furlaneto.murilo.movie.ui.components.components.MovieSection
import br.com.furlaneto.murilo.movie.ui.movies.MoviesListViewModel
import movie.composeapp.generated.resources.Res
import movie.composeapp.generated.resources.movies_list_popular_movies
import movie.composeapp.generated.resources.movies_list_top_rated_movies
import movie.composeapp.generated.resources.movies_list_upcoming_movies
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MoviesListRoute(
    viewModel: MoviesListViewModel = koinViewModel()
) {
    val moviesListState by viewModel.moviesListState.collectAsStateWithLifecycle()

    MoviesListScreen(moviesListState = moviesListState)
}


@Composable
fun MoviesListScreen(
    moviesListState: MoviesListViewModel.MovieListState,
) {
    Scaffold { paddingValues ->
        Box(
            modifier = Modifier.fillMaxSize()
                .padding(paddingValues)
        ){
            when(moviesListState){
                is MoviesListViewModel.MovieListState.Success -> {
                    LazyColumn(
                                     modifier = Modifier.padding(paddingValues),
                                    contentPadding = PaddingValues(vertical = 16.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                                         ) {

                        items(moviesListState.moviesSections.size){
                            movieSection ->
                            val title = when(moviesListState.moviesSections[movieSection].sectionType){
                                MovieSection.SectionType.POPULAR -> stringResource(Res.string.movies_list_popular_movies)
                                MovieSection.SectionType.TOP_RATED -> stringResource(Res.string.movies_list_top_rated_movies)
                                MovieSection.SectionType.UPCOMING -> stringResource(Res.string.movies_list_upcoming_movies)
                            }
                            MovieSection(
                                title,
                                moviesListState.moviesSections[movieSection].movies,
                                Modifier.padding(top = 32.dp)
                            )
                        }

                                 }
                }
                is MoviesListViewModel.MovieListState.Loading -> {
                    CircularProgressIndicator(
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                is MoviesListViewModel.MovieListState.Error -> {
                    Text("Erro: ${moviesListState.message}", modifier = Modifier.padding(16.dp).align(Alignment.Center), textAlign = TextAlign.Center)
                }

            }
        }
    }
}

