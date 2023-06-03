package com.padc.themoviebookingapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.viewholders.ItemListViewHolder

class ItemListAdapter(): RecyclerView.Adapter<ItemListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_item_list, parent, false)
        return ItemListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: ItemListViewHolder, position: Int) {

    }
}