package br.com.furlaneto.murilo.movie.domain.model

data class Movie(
    val id: Int,
    val title: String,
    val overview: String,
    val posterUrl: String,
)


// fake objects

val movie1 = Movie(
    id = 1,
    title = "A Minecraft Movie",
    overview = " Movie overview ",
    posterUrl = "https://example.com/poster1.jpg"
)