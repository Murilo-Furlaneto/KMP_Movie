package br.com.furlaneto.murilo.movie.ui.components.movies

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.furlaneto.murilo.movie.domain.model.Movie
import br.com.furlaneto.murilo.movie.domain.model.movie1
import br.com.furlaneto.murilo.movie.ui.components.components.MovieSection
import br.com.furlaneto.murilo.movie.ui.components.movies.components.MoviePoster

@Composable
fun MoviesListRoute(modifier: Modifier = Modifier) {
    MoviesListScreen()
}


@Composable
fun MoviesListScreen() {
    Scaffold { paddingValues ->
        LazyColumn(
            modifier = Modifier.padding(paddingValues),
            contentPadding = PaddingValues(vertical = 16.dp)
        ) {
            item {
                MovieSection(
                    title = "Popular Movies", movies = List(10) {
                        movie1
                    },
                    Modifier.padding(top = 32.dp)
                )
            }
            item {
                MovieSection(
                    title = "Top Rated Movies", movies = List(10) {
                        movie1
                    },
                    Modifier.padding(top = 32.dp),
                    )
            }
            item {
                MovieSection(
                    title = "Upcoming Movies", movies = List(10) {
                        movie1
                    },
                    Modifier.padding(top = 32.dp),
                    )
            }
        }
    }
}