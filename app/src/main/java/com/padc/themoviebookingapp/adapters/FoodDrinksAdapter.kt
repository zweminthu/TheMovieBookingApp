package com.padc.themoviebookingapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.viewholders.FoodDrinksViewHolder

class FoodDrinksAdapter: RecyclerView.Adapter<FoodDrinksViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodDrinksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_foods_drinks, parent, false)
        return FoodDrinksViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: FoodDrinksViewHolder, position: Int) {

    }
}