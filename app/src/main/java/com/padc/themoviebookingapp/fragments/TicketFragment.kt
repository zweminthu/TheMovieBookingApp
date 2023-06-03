package com.padc.themoviebookingapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.adapters.TicketAdapter
import com.padc.themoviebookingapp.delegates.TicketViewHolderDelegate
import kotlinx.android.synthetic.main.fragment_ticket.rvTicket

class TicketFragment: Fragment(), TicketViewHolderDelegate {

    lateinit var mTicketAdapter: TicketAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_ticket, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpTicketRecyclerView()
    }

    private fun setUpTicketRecyclerView(){
        mTicketAdapter = TicketAdapter(this)
        rvTicket.adapter = mTicketAdapter
    }

    override fun onTapTicket(position: Int) {

    }
}