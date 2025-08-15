package br.com.furlaneto.murilo.movie.navigation

sealed interface AppRoutes {
    data object MoviesList : AppRoutes
    data class MovieDetails(val id: Int) : AppRoutes
}