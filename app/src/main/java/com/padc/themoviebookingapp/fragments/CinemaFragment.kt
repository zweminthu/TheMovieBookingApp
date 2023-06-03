package com.padc.themoviebookingapp.fragments



import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.activities.SeatActivity
import com.padc.themoviebookingapp.adapters.CinemaAdapter
import com.padc.themoviebookingapp.delegates.ShowTimeViewHolderDelegate
import kotlinx.android.synthetic.main.activity_select_cinema.rvCinema

class CinemaFragment: Fragment(), ShowTimeViewHolderDelegate {

    lateinit var mCinemaAdapter: CinemaAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cinema, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerView()

    }
    private fun setUpRecyclerView(){
        mCinemaAdapter = CinemaAdapter(this)
        rvCinema.adapter = mCinemaAdapter
    }

    override fun onLongPressShowTime(position: Int) {
        val intent = Intent(activity, SeatActivity::class.java)
        startActivity(intent)
    }
}