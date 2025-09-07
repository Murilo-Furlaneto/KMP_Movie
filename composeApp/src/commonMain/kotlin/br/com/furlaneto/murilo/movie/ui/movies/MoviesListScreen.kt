package br.com.furlaneto.murilo.movie.ui.components.movies

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.furlaneto.murilo.movie.data.network.IMAGE_SMALL_BASE_URL
import br.com.furlaneto.murilo.movie.data.network.KtorClient
import br.com.furlaneto.murilo.movie.domain.model.Movie
import br.com.furlaneto.murilo.movie.domain.model.movie1
import br.com.furlaneto.murilo.movie.ui.components.components.MovieSection

@Composable
fun MoviesListRoute(modifier: Modifier = Modifier) {
    var popularMovies by remember{
        mutableStateOf(emptyList<Movie>())
    }

    LaunchedEffect(Unit){
        val response = KtorClient.getMovies("popular")
        popularMovies = response.results.map { movieResponse ->
            Movie(
                id = movieResponse.id,
                title = movieResponse.title,
                overview = movieResponse.overview,
                posterUrl = "$IMAGE_SMALL_BASE_URL/${movieResponse.posterPath}",
            )
        }
    }
    MoviesListScreen(popularMovies = popularMovies)
}


@Composable
fun MoviesListScreen(
    popularMovies: List<Movie> = emptyList(),
) {
    Scaffold { paddingValues ->
        LazyColumn(
            modifier = Modifier.padding(paddingValues),
            contentPadding = PaddingValues(vertical = 16.dp)
        ) {
            item {
                MovieSection(
                    title = "Popular Movies", movies = popularMovies,
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