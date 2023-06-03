package com.padc.themoviebookingapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.viewholders.CastViewHolder
import com.padc.themoviebookingapp.viewholders.DateViewHolder

class DateAdapter: RecyclerView.Adapter<DateViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DateViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_date, parent, false)
        return DateViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 7
    }

    override fun onBindViewHolder(holder: DateViewHolder, position: Int) {

    }
}