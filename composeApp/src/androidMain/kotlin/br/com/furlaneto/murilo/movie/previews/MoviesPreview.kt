package br.com.furlaneto.murilo.movie.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.furlaneto.murilo.movie.domain.model.movie1
import br.com.furlaneto.murilo.movie.ui.components.movies.MoviesListScreen
import br.com.furlaneto.murilo.movie.ui.components.movies.components.MoviePoster
import br.com.furlaneto.murilo.movie.ui.movies.MoviesListViewModel
import br.com.furlaneto.murilo.movie.domain.model.MovieSection

@Preview(showBackground = true)
@Composable
private fun MoviePosterPreview(){
    MoviePoster(
        movie = movie1,
    )
}

@Preview(showBackground = true)
@Composable
private fun MoviesListPreview(){
    MoviesListScreen(
        moviesListState = MoviesListViewModel.MovieListState.Success(
            moviesSections = listOf(
                MovieSection(
                    sectionType = MovieSection.SectionType.POPULAR,
                    movies = listOf(
                        movie1,
                    )
                )
            )

        )
    )
}