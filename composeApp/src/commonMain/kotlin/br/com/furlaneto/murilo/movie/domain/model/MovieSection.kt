package br.com.furlaneto.murilo.movie.domain.model

class MovieSection (
    val movies: List<Movie>,
    val sectionType: SectionType,

){
    enum class SectionType{
        POPULAR,
        TOP_RATED,
        UPCOMING,

    }
}