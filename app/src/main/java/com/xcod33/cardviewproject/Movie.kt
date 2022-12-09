package com.xcod33.cardviewproject

var movieList = mutableListOf<Movie>()
val MOVIE_ID_EXTRA = "movieExtra"

class Movie (
    var cover: Int,
    var genre: String,
    var title: String,
    var description: String,
    var id: Int? = movieList.size
        ) {

}