package com.xcod33.cardviewproject

import androidx.recyclerview.widget.RecyclerView
import com.xcod33.cardviewproject.databinding.CardCellBinding

class CardViewHolder (
    private val cardCellBinding: CardCellBinding,
    private val clickListener: MovieClickListener
        ) : RecyclerView.ViewHolder(cardCellBinding.root) {
    fun bindMovie(movie: Movie) {
        cardCellBinding.cover.setImageResource(movie.cover)
        cardCellBinding.title.text = movie.title
        cardCellBinding.genre.text = movie.genre

        cardCellBinding.cardView.setOnClickListener {
            clickListener.onClick(movie)
        }
    }
}