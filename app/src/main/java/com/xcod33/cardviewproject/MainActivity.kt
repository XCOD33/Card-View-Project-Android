package com.xcod33.cardviewproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.xcod33.cardviewproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MovieClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateMovies()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(movieList, mainActivity)
        }
    }

    override fun onClick(movie: Movie) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(MOVIE_ID_EXTRA, movie.id)
        startActivity(intent)
    }

    private fun populateMovies() {
        val movie1 = Movie(
            R.drawable.the_godfather_1972,
            "Drama, Crime",
            "The Godfather",
            "Spanning the years 1945 to 1955, a chronicle of the fictional Italian-American Corleone crime family. When organized crime family patriarch, Vito Corleone barely survives an attempt on his life, his youngest son, Michael steps in to take care of the would-be killers, launching a campaign of bloody revenge."
        )
        movieList.add(movie1)

        val movie2 = Movie(
            R.drawable.the_shawshank_redemption_1994,
            "Drama, Crime",
            "The Shawshank Redemption (1994)",
            "Framed in the 1940s for the double murder of his wife and her lover, upstanding banker Andy Dufresne begins a new life at the Shawshank prison, where he puts his accounting skills to work for an amoral warden. During his long stretch in prison, Dufresne comes to be admired by the other inmates -- including an older prisoner named Red -- for his integrity and unquenchable sense of hope."
        )
        movieList.add(movie2)

        val movie3 = Movie(
            R.drawable.the_godfather_part_ii_1974,
            "Drama, Crime",
            "The Godfather Part II",
            "In the continuing saga of the Corleone crime family, a young Vito Corleone grows up in Sicily and in 1910s New York. In the 1950s, Michael Corleone attempts to expand the family business into Las Vegas, Hollywood and Cuba."
        )
        movieList.add(movie3)

        val movie4 = Movie(
            R.drawable._0th_century_girl,
            "Romance, Drama",
            "20th Century Girl",
            "Yeon-du asks her best friend Bora to collect all the information she can about Baek Hyun-jin while she is away in the U.S. for heart surgery. Bora decides to get close to Baek's best friend, Pung Woon-ho first. However, Bora's clumsy plan unfolds in an unexpected direction. In 1999, a year before the new century, Bora, who turns seventeen, falls into the fever of first love."
        )
        movieList.add(movie4)

        val movie5 = Movie(
            R.drawable.schindler_s_list_1993,
            "Drama, History, War",
            "Schindler's List",
            "The true story of how businessman Oskar Schindler saved over a thousand Jewish lives from the Nazis while they worked as slaves in his factory during World War II."
        )
        movieList.add(movie5)

        val movie6 = Movie(
            R.drawable.dilwale_dulhania_le_jayenge_1995,
            "Comedy, Drama, Romance",
            "Dilwale Dulhania Le Jayenge",
            "Raj is a rich, carefree, happy-go-lucky second generation NRI. Simran is the daughter of Chaudhary Baldev Singh, who in spite of being an NRI is very strict about adherence to Indian values. Simran has left for India to be married to her childhood fiancé. Raj leaves for India with a mission at his hands, to claim his lady love under the noses of her whole family. Thus begins a saga."
        )
        movieList.add(movie6)

        val movie7 = Movie(
            R.drawable.spirited_away_2001,
            "Animation, Family, Fantasy",
            "Spirited Away",
            "A young girl, Chihiro, becomes trapped in a strange new world of spirits. When her parents undergo a mysterious transformation, she must call upon the courage she never knew she had to free her family."
        )
        movieList.add(movie7)

        val movie8 = Movie(
            R.drawable._2_angry_men_1957,
            "Drama",
            "12 Angry Men",
            "The defense and the prosecution have rested and the jury is filing into the jury room to decide if a young Spanish-American is guilty or innocent of murdering his father. What begins as an open and shut case soon becomes a mini-drama of each of the jurors' prejudices and preconceptions about the trial, the accused, and each other."
        )
        movieList.add(movie8)

        val movie9 = Movie(
            R.drawable.your_name_2016,
            "Romance, Animation, Drama",
            "Your Name.",
            "High schoolers Mitsuha and Taki are complete strangers living separate lives. But one night, they suddenly switch places. Mitsuha wakes up in Taki’s body, and he in hers. This bizarre occurrence continues to happen randomly, and the two must adjust their lives around each other."
        )
        movieList.add(movie9)

        val movie10 = Movie(
            R.drawable.parasite_2019,
            "Comedy, Drama, Thriller",
            "Parasite",
            "All unemployed, Ki-taek's family takes peculiar interest in the wealthy and glamorous Parks for their livelihood until they get entangled in an unexpected incident."
        )
        movieList.add(movie10)
    }
}