package com.padc.themoviebookingapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.viewholders.ProfileItemViewHolder

class ProfileItemAdapter(): RecyclerView.Adapter<ProfileItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_profile_item, parent, false)
        return ProfileItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 7
    }

    override fun onBindViewHolder(holder: ProfileItemViewHolder, position: Int) {

    }
}