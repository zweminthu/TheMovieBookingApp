package com.padc.themoviebookingapp.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.adapters.PaymentTypeAdapter
import com.padc.themoviebookingapp.delegates.PaymentTypeViewHolderDelegate
import kotlinx.android.synthetic.main.activity_payment.*

class PaymentActivity: AppCompatActivity(), PaymentTypeViewHolderDelegate {

    private lateinit var mPaymentTypeAdapter: PaymentTypeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        setUpBackListener()
        setUpPaymentTypeRecyclerView()

    }

    private fun setUpBackListener(){
        btnBackToCheckout.setOnClickListener(){
            super.onBackPressed()
        }
    }
    private fun setUpPaymentTypeRecyclerView() {
        mPaymentTypeAdapter = PaymentTypeAdapter(this)
        rvPaymentType.adapter = mPaymentTypeAdapter


    }

    override fun onItemClick(position: Int) {
        val intent = Intent(this, TicketConfirmationActivity::class.java)
        startActivity(intent)
    }


}