package com.padc.themoviebookingapp.activities

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.padc.themoviebookingapp.R
import kotlinx.android.synthetic.main.activity_checkout.*



class CheckoutActivity: AppCompatActivity() {

    lateinit var mView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)
        setUpBackListener()
        setUpGoToPayment()
        setUpButtonCancellationPolicy()


    }

    private fun setUpBackListener(){
        btnBackToFoodAndDrinks.setOnClickListener(){
            super.onBackPressed()
        }
    }

    private fun setUpGoToPayment(){
        btnContinue.setOnClickListener {
            val intent = Intent(this, PaymentActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setUpButtonCancellationPolicy(){
        ivTicketCancellationPolicy.setOnClickListener {
            setUpCancellationPolicy()
        }
    }

    private fun setUpCancellationPolicy(){
        val cancellationPolicy = LayoutInflater.from(this).inflate(R.layout.ticket_cancellation_alert_dialog_box, null)
        val mBtnClose = cancellationPolicy.findViewById<AppCompatButton>(R.id.btnClose)
        val builder = AlertDialog.Builder(this)
        builder.setView(cancellationPolicy)
        val dialog = builder.create()
        dialog.show()
        mBtnClose.setOnClickListener {
            dialog.dismiss()
        }
    }
}