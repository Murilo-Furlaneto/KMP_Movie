package br.com.furlaneto.murilo.movie.domain.model

import br.com.furlaneto.murilo.movie.data.network.IMAGE_SMALL_BASE_URL
import br.com.furlaneto.murilo.movie.data.model.MovieResponse

data class Movie(
    val id: Int,
    val title: String,
    val overview: String,
    val posterUrl: String,
)

fun MovieResponse.toModel() = Movie(
    id = this.id,
    title = this.title,
    overview = this.overview,
    posterUrl = "$IMAGE_SMALL_BASE_URL/${this.posterPath}",
)

// fake objects

val movie1 = Movie(
    id = 1,
    title = "A Minecraft Movie",
    overview = " Movie overview ",
    posterUrl = "https://example.com/poster1.jpg"
)