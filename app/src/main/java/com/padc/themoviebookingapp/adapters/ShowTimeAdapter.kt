package com.padc.themoviebookingapp.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.activities.SeatActivity
import com.padc.themoviebookingapp.delegates.ShowTimeViewHolderDelegate
import com.padc.themoviebookingapp.viewholders.ShowTimeViewHolder

class ShowTimeAdapter(val mShowTimeViewHolderDelegate: ShowTimeViewHolderDelegate): RecyclerView.Adapter<ShowTimeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowTimeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_showtime_screen_type, parent, false)
        return ShowTimeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: ShowTimeViewHolder, position: Int) {
        holder.itemView.setOnLongClickListener {
            mShowTimeViewHolderDelegate.onLongPressShowTime(position)
            true

        }
    }

}