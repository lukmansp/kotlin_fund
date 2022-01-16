package com.aressalabs.moviewkwkwk.core.feature.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aressalabs.moviewkwkwk.R
import com.aressalabs.moviewkwkwk.core.domain.model.MovieModel
import com.aressalabs.moviewkwkwk.core.feature.home.`interface`.IMovieRecyclerListener
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter(

    private val movies : List<MovieModel>

): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){

    var listener: IMovieRecyclerListener? = null

    inner class MovieViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val baseImage = "https://image.tmdb.org/t/p/w500/"

        fun bindMovie(movie: MovieModel){

            itemView.movie_title.text = movie.originalTitle
            itemView.movie_desc.text = movie.overview
            Glide.with(itemView).load(baseImage + movie.posterPath)
                .into(itemView.movie_image)

            itemView.setOnClickListener{
                listener?.onItemClicked(it, movie)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return  MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {

        holder.bindMovie(movies[position])
    }

    override fun getItemCount(): Int {
        return movies.size
    }

}
