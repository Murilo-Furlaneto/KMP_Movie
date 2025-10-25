package br.com.furlaneto.murilo.movie.di

import br.com.furlaneto.murilo.movie.data.network.KtorClient
import br.com.furlaneto.murilo.movie.data.repository.MoviesRepository
import org.koin.dsl.module

val networkModule = module {
    single { KtorClient() }
    single { MoviesRepository(ktorClient = get()) }

}