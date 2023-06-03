package com.padc.themoviebookingapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.delegates.PaymentTypeViewHolderDelegate
import com.padc.themoviebookingapp.viewholders.PaymentTypeViewHolder

class PaymentTypeAdapter(val mDelegate: PaymentTypeViewHolderDelegate): RecyclerView.Adapter<PaymentTypeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentTypeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_payment_type, parent, false)
        return PaymentTypeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 7
    }

    override fun onBindViewHolder(holder: PaymentTypeViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            mDelegate.onItemClick(position)
            true
        }
    }
}