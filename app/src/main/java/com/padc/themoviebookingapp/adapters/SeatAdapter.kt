package com.padc.themoviebookingapp.adapters

import android.content.ClipData
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.viewholders.CoupleSeatViewHolder
import com.padc.themoviebookingapp.viewholders.SeatClassNameViewHolder
import com.padc.themoviebookingapp.viewholders.SingleSeatViewHolder

class SeatAdapter(): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val SEAT_CLASS_NAME = 0
    private val SINGLE_SEAT = 1
    private val COUPLE_SEAT = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            SEAT_CLASS_NAME -> SeatClassNameViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_holder_seat_class_name, parent, false))
            SINGLE_SEAT -> SingleSeatViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_holder_single_seat, parent, false))
            COUPLE_SEAT -> CoupleSeatViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_holder_couple_seat, parent, false))
            else -> SingleSeatViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_holder_single_seat, parent, false))
        }
    }

    override fun getItemCount(): Int {
        return 12
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemViewType(position: Int): Int {
        return when(position) {
            0, 3, 6, 9 -> SEAT_CLASS_NAME
            1, 2, 4, 5, 7, 8 -> SINGLE_SEAT
            else -> COUPLE_SEAT
        }
    }
}