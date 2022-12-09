package com.xcod33.cardviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xcod33.cardviewproject.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bookID = intent.getIntExtra(MOVIE_ID_EXTRA, -1)
        val book = movieFromID(bookID)
        if(book != null) {
            binding.cover.setImageResource(book.cover)
            binding.title.text = book.title
            binding.description.text = book.description
            binding.genre.text = book.genre
        }
    }

    private fun movieFromID(movieID: Int): Movie? {
        for(movie in movieList) {
            if(movie.id == movieID) {
                return movie
            }
        }
        return null
    }
}