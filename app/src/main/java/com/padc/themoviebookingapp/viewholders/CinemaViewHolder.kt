package com.padc.themoviebookingapp.viewholders

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager

import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebookingapp.R

import com.padc.themoviebookingapp.adapters.ShowTimeAdapter
import com.padc.themoviebookingapp.delegates.ShowTimeViewHolderDelegate
import kotlinx.android.synthetic.main.view_holder_cinema.view.*


class CinemaViewHolder(itemView: View, val showTimeViewHolderDelegate: ShowTimeViewHolderDelegate): RecyclerView.ViewHolder(itemView), View.OnClickListener {

    init {
        itemView.setOnClickListener(this)
    }

    val mShowTimeAdapter: ShowTimeAdapter = ShowTimeAdapter(showTimeViewHolderDelegate)
    val mRecyclerViewShowTime: RecyclerView = itemView.findViewById(R.id.rvShowTime)



    override fun onClick(v: View?) {
        // Check if the nested RecyclerView is visible
        val isVisible = mRecyclerViewShowTime.visibility == View.VISIBLE

        itemView.vInfoCircle.visibility = if (isVisible) View.GONE else View.VISIBLE
        itemView.tvInfoShowTime.visibility = if (isVisible) View.GONE else View.VISIBLE

        // Toggle the visibility of the nested RecyclerView
        mRecyclerViewShowTime.visibility = if (isVisible) View.GONE else View.VISIBLE
    }

//    fun bind(adapter: ShowTimeAdapter) {
//        mRecyclerViewShowTime.layoutManager = LinearLayoutManager(itemView.context)
//        mRecyclerViewShowTime.adapter = adapter
//    }
}