package com.padc.themoviebookingapp.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.padc.themoviebookingapp.R
import kotlinx.android.synthetic.main.activity_ticket_confirmation.btnDone

class TicketConfirmationActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ticket_confirmation)

        val mainContainer = findViewById<CoordinatorLayout>(R.id.clTicketConfirmation)
        val overlay = layoutInflater.inflate(R.layout.ticket_confirmation_overlay, mainContainer, false)
        mainContainer.addView(overlay)

        // Hide the overlay initially
        overlay.visibility = View.GONE

        // Set a click listener on the overlay to show the main layout
        overlay.setOnClickListener {
            overlay.visibility = View.GONE
        }
        setUpDoneButton()


    }

    private fun setUpDoneButton(){
        btnDone.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}