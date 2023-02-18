package com.padc.themoviebookingapp.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebookingapp.delegates.MovieViewHolderDelegate
import com.padc.themoviebookingapp.fragments.MoviesFragment

class MovieViewHolder(itemView: View,  val mDelegate: MovieViewHolderDelegate): RecyclerView.ViewHolder(itemView){
    init {
        itemView.setOnClickListener(){
            mDelegate.onTapMovie()
        }
    }
}