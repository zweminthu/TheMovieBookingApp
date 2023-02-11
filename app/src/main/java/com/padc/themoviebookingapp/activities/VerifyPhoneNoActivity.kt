package com.padc.themoviebookingapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.padc.themoviebookingapp.R
import kotlinx.android.synthetic.main.activity_login.*

class VerifyPhoneNoActivity : AppCompatActivity() {

    lateinit var spinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        spinner = findViewById(R.id.spCountryCode)
        val countryCode = arrayOf<String?>("+95", "+1", "+44", "+52", "+91", "+93")
        val arrayAdapter: ArrayAdapter<Any?> = ArrayAdapter<Any?>(this, R.layout.selected_country_code, countryCode)
        arrayAdapter.setDropDownViewResource(R.layout.drop_down_country_code)
        spinner.adapter = arrayAdapter

        btnVerifyPhNo.setOnClickListener {
            val intent = Intent(this, GetOTPActivity::class.java)
            startActivity(intent)
        }

    }
}