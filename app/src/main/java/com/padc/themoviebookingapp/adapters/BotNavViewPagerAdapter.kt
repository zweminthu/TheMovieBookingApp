package com.padc.themoviebookingapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.padc.themoviebookingapp.fragments.CinemaFragment
import com.padc.themoviebookingapp.fragments.MoviesFragment
import com.padc.themoviebookingapp.fragments.ProfileFragment
import com.padc.themoviebookingapp.fragments.TicketFragment

class BotNavViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return MoviesFragment()
            1 -> return CinemaFragment()
            2 -> return TicketFragment()
            3 -> return ProfileFragment()
        }
        return MoviesFragment()
    }
}
