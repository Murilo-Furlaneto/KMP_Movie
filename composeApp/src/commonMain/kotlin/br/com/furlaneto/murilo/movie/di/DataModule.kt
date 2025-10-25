package br.com.furlaneto.murilo.movie.di

import br.com.furlaneto.murilo.movie.data.repository.MoviesRepository
import org.koin.dsl.module

val dataModule = module {
    factory {
        MoviesRepository(
            get()
        )

    }
}