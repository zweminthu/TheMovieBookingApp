package com.padc.themoviebookingapp.activities

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.padc.themoviebookingapp.R
import kotlinx.android.synthetic.main.activity_location.*

class LocationActivity: AppCompatActivity() {

    // creating variables for listview
    lateinit var citiesLV: ListView

    // creating array adapter for listview
    lateinit var listAdapter: ArrayAdapter<String>

    // creating array list for listview
    lateinit var cities: Array<String>;

    // creating variable for edittext
    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)
        setUpTextChangedListener()

        btnPickRegion.setOnClickListener {
            val intent = Intent(this, MainActivity ::class.java)
            startActivity(intent)
        }

    }
    private fun setUpTextChangedListener(){
        cities = arrayOf("Yangon", "Mandalay", "Naypyidaw", "Bago", "Mawlamyine")

        // initializing variables of list view with their ids.
        citiesLV = findViewById<ListView>(R.id.lvCities)
        editText = findViewById(R.id.svCities)

        // initializing list adapter and setting layout
        // for each list view item and adding array list to it.
        listAdapter = ArrayAdapter<String>(this, R.layout.list_view_cities, cities)

        // on below line setting list
        // adapter to our list view.
        citiesLV.adapter = listAdapter

        // on below line we are adding on query
        // listener for our search view.
        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })
    }


}