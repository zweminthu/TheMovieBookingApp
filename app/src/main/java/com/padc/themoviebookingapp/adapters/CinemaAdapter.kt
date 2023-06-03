package com.padc.themoviebookingapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.delegates.ShowTimeViewHolderDelegate
import com.padc.themoviebookingapp.viewholders.CinemaViewHolder

class CinemaAdapter(val showTimeViewHolderDelegate: ShowTimeViewHolderDelegate): RecyclerView.Adapter<CinemaViewHolder>() {

    lateinit var context: Context



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_cinema, parent, false)
        context = parent.context
        return CinemaViewHolder(view, showTimeViewHolderDelegate)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: CinemaViewHolder, position: Int) {
        holder.mRecyclerViewShowTime.adapter = holder.mShowTimeAdapter
        }


}
