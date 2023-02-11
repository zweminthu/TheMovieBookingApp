package com.padc.themoviebookingapp.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.padc.themoviebookingapp.R
import kotlinx.android.synthetic.main.activity_get_otp.*
import kotlinx.android.synthetic.main.activity_login.*

class GetOTPActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_otp)
        setUpBackListeners()

        btnConfirmOTP.setOnClickListener {
            val intent = Intent(this, LocationActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setUpBackListeners(){
        btnBack.setOnClickListener(){
            super.onBackPressed()
        }
    }
}