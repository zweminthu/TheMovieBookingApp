package com.padc.themoviebookingapp.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.adapters.SeatAdapter
import kotlinx.android.synthetic.main.activity_seat.*
import kotlinx.android.synthetic.main.activity_select_cinema.*

class SeatActivity: AppCompatActivity() {

    lateinit var mSeatAdapter: SeatAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seat)
        setUpSeatRecyclerView()
        setUpBuyTicketButton()
        setUpBackListener()

    }

    private fun setUpSeatRecyclerView(){
        mSeatAdapter = SeatAdapter()
        rvSeat.adapter = mSeatAdapter
    }

    private fun setUpBackListener(){
        btnBackToSelectCinema.setOnClickListener(){
            super.onBackPressed()
        }
    }

    private fun setUpBuyTicketButton(){
        btnBooking.setOnClickListener {
            val intent = Intent(this, FoodDrinksActivity::class.java)
            startActivity(intent)
        }
    }

}