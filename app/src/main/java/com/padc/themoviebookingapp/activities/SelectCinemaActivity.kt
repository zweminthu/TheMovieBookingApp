package com.padc.themoviebookingapp.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.adapters.CinemaAdapter
import com.padc.themoviebookingapp.adapters.DateAdapter
import com.padc.themoviebookingapp.delegates.ShowTimeViewHolderDelegate
import kotlinx.android.synthetic.main.activity_select_cinema.*

class SelectCinemaActivity: AppCompatActivity(), ShowTimeViewHolderDelegate {


    private lateinit var mDateAdapter: DateAdapter
    private lateinit var mCinemaAdapter: CinemaAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_cinema)
        setUpBackListeners()
        setUpDateRecyclerView()
        setUpCinemaRecyclerView()



    }

    private fun setUpBackListeners(){
        btnBackToMovieDetail.setOnClickListener(){
            super.onBackPressed()
        }
    }

    private fun setUpDateRecyclerView() {
        mDateAdapter = DateAdapter()
        rvDate.adapter = mDateAdapter


    }

    private fun setUpCinemaRecyclerView(){
        val dividerItemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL )
        dividerItemDecoration.setDrawable(ContextCompat.getDrawable(this, R.drawable.divider_cinema_list)!!)
        rvCinema.addItemDecoration(dividerItemDecoration)
        mCinemaAdapter = CinemaAdapter(this)
        rvCinema.adapter = mCinemaAdapter
    }

    override fun onLongPressShowTime(position: Int) {

        val intent = Intent(this, SeatActivity::class.java)
        startActivity(intent)
    }


}