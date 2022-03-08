package com.raywenderlich.wewatch.main

import com.raywenderlich.wewatch.model.Movie

class MainContract {
    interface PresenterInterface {
        fun getMyMoviesList()
    }

    interface ViewInterface {
        fun displayMovies(movieList: List<Movie>)
        fun displayNoMovies()
        fun displayMessage(message: String)
        fun displayError(message: String)
    }
}