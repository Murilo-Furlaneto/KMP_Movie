package br.com.furlaneto.murilo.movie

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.furlaneto.murilo.movie.di.dataModule
import br.com.furlaneto.murilo.movie.di.networkModule
import br.com.furlaneto.murilo.movie.di.viewModelModule
import br.com.furlaneto.murilo.movie.navigation.AppRoutes
import br.com.furlaneto.murilo.movie.ui.components.movies.MoviesListRoute
import br.com.furlaneto.murilo.movie.ui.components.movies.MoviesListScreen
import br.com.furlaneto.murilo.movie.ui.theme.MoviesAppTheme
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinApplication
import movie.composeapp.generated.resources.Res
import movie.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    KoinApplication(
        application = {
            modules(
                networkModule,
                dataModule,
                viewModelModule
            )
        }
    ){
        MoviesAppTheme{
            val navController = rememberNavController()
            NavHost(navController, startDestination = AppRoutes.MoviesList){
                composable<AppRoutes.MoviesList> {
                    MoviesListRoute()
                }

                composable<AppRoutes.MovieDetails> {
                    //MovieDetailsScreen()
                }
            }

        }
    }

    }
