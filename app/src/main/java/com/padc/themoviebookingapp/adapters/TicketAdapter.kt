package com.padc.themoviebookingapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.delegates.TicketViewHolderDelegate
import com.padc.themoviebookingapp.viewholders.TicketViewHolder

class TicketAdapter(val ticketViewHolderDelegate: TicketViewHolderDelegate):
    RecyclerView.Adapter<TicketViewHolder>() {
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TicketViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_ticket, parent, false)
        context = parent.context
        return TicketViewHolder(view, ticketViewHolderDelegate)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: TicketViewHolder, position: Int) {

    }
}