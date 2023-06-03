package com.padc.themoviebookingapp.viewholders

import android.view.View
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebookingapp.delegates.MovieViewHolderDelegate
import com.padc.themoviebookingapp.fragments.MoviesFragment
import kotlinx.android.synthetic.main.view_holder_movie_list.view.*

class MovieViewHolder(itemView: View,  val mDelegate: MovieViewHolderDelegate, val isUpcoming: Boolean): RecyclerView.ViewHolder(itemView){
    init {
        itemView.setOnClickListener(){
            mDelegate.onTapMovie(isUpcoming)
        }
    }

    fun bindData(){
//    mMovieVO = movie

//        Glide.with(itemView.context)
//            .load("$IMAGE_BASE_URL${movie.posterPath}")
//            .into(itemView.ivMovieImage)
//        itemView.tvMovieName.text = movie.title
//        itemView.tvMovieRating.text = movie.voteAverage?.toString()
//        itemView.rbMovieRating.rating = movie.getRatingBasedOnFiveStars()

            itemView.tvComingSoonDate.isVisible = isUpcoming

    }
}
