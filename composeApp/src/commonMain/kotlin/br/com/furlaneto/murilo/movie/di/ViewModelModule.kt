package br.com.furlaneto.murilo.movie.di

import br.com.furlaneto.murilo.movie.ui.movies.MoviesListViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        MoviesListViewModel(
            get()
        )
    }

}