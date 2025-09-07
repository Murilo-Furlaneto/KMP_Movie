package br.com.furlaneto.murilo.movie.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.furlaneto.murilo.movie.domain.model.movie1
import br.com.furlaneto.murilo.movie.ui.components.movies.MoviesListScreen
import br.com.furlaneto.murilo.movie.ui.components.movies.components.MoviePoster

@Preview(showBackground = true)
@Composable
private fun MoviePosterPreview(){
    MoviePoster(
        movie = movie1
    )
}

@Preview(showBackground = true)
@Composable
private fun MoviesListPreview(){
    MoviesListScreen(
        popularMovies = listOf(
            movie1
        )
    )
}