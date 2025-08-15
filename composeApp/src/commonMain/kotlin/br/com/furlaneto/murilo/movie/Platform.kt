package br.com.furlaneto.murilo.movie

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform