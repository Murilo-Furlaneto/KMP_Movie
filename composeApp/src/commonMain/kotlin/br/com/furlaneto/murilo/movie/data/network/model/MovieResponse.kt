package br.com.furlaneto.murilo.movie.data.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class MovieListResponse(
    val results: List<MovieResponse>
)

@Serializable
data class MovieResponse (
    val id: Int,
    val title: String,
    val overview: String,
    @SerialName("poster_path")
    val posterPath: String,
){

}
