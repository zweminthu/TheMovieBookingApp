package com.padc.themoviebookingapp.activities

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.adapters.BotNavViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {

    lateinit var mBotNavViewPagerAdapter: BotNavViewPagerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        if(savedInstanceState == null){
//            supportFragmentManager.commit {
//                setReorderingAllowed(true)
//                add<MoviesFragment>(R.layout.fragment_movies)
//            }
//        }
//        supportFragmentManager.beginTransaction()
//            .add(R.id.action_movies, MoviesFragment())
////            .add(R.id.fragmentCinema, CinemaFragment())
////            .add(R.id.fragmentTicket, TicketFragment())
////            .add(R.id.fragmentProfile, ProfileFragment())
//            .commit()
//        supportFragmentManager.commit {
//            add<MoviesFragment>(R.layout.fragment_movies)
//        }
//        setUpCarousel()
        setUpBotNavViewPager()


    }

    private fun setUpBotNavViewPager(){
        mBotNavViewPagerAdapter = BotNavViewPagerAdapter(this)
        viewPagerBotNav.adapter = mBotNavViewPagerAdapter
//        viewPagerBotNav.adapter = BotNavViewPagerAdapter(this)
        viewPagerBotNav.currentItem = 0
        bot_nav.selectedItemId = R.id.action_movies

        viewPagerBotNav.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                when (position){
                    0 -> bot_nav.selectedItemId = R.id.action_movies
                    1 -> bot_nav.selectedItemId = R.id.action_cinema
                    2 -> bot_nav.selectedItemId = R.id.action_ticket
                    3 -> bot_nav.selectedItemId = R.id.action_profile
                }
            }
        })

        bot_nav.setOnNavigationItemSelectedListener { menuItem: MenuItem ->
            when (menuItem.itemId){
                R.id.action_movies -> {
                    viewPagerBotNav.currentItem = 0
                    true
                }
                R.id.action_cinema -> {
                    viewPagerBotNav.currentItem = 1
                    true
                }
                R.id.action_ticket -> {
                    viewPagerBotNav.currentItem = 2
                    true
                }
                R.id.action_profile -> {
                    viewPagerBotNav.currentItem = 3
                    true
                }
            }
            true
        }
    }



}