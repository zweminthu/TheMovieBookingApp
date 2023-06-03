package com.padc.themoviebookingapp.fragments


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.activities.VerifyPhoneNoActivity
import com.padc.themoviebookingapp.adapters.ProfileItemAdapter
import kotlinx.android.synthetic.main.fragment_profile.rvProfile

class ProfileFragment: Fragment() {

    lateinit var mProfileItemAdapter: ProfileItemAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val button = view.findViewById<Button>(R.id.btnLoginOrSignUp)
        button.setOnClickListener{
            val intent = Intent(activity, VerifyPhoneNoActivity::class.java)
            startActivity(intent)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpProfileItemRecyclerView()
    }

    private fun setUpProfileItemRecyclerView(){
        mProfileItemAdapter = ProfileItemAdapter()
        rvProfile.adapter = mProfileItemAdapter
    }


}