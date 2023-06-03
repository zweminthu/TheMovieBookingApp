package com.padc.themoviebookingapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.delegates.MovieViewHolderDelegate
import com.padc.themoviebookingapp.viewholders.MovieViewHolder

class MovieAdapter(private val mDelegate: MovieViewHolderDelegate, private val isUpcoming: Boolean ) : RecyclerView.Adapter<MovieViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_movie_list, parent, false)
        return MovieViewHolder(view, mDelegate, isUpcoming)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindData()
    }



}