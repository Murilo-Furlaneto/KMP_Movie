package br.com.furlaneto.murilo.movie.ui.components.components

import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.furlaneto.murilo.movie.domain.model.Movie
import br.com.furlaneto.murilo.movie.ui.components.movies.components.MoviePoster

@Composable
fun MovieSection(
    title: String,
    movies: List<Movie>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ){
        Text(
            title,
            modifier = Modifier
                .padding(horizontal = 16.dp),
            style = MaterialTheme.typography.titleLarge,
        )
        LazyRow(
            modifier = Modifier
                .padding(top = 8.dp),
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(movies.size) {
              movie ->  MoviePoster(
                  movie = movies[movie],
              )
            }
        }
    }
}