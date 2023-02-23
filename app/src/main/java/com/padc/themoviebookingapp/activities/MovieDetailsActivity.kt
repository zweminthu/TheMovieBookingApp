package com.padc.themoviebookingapp.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem

import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.adapters.CastAdapter
import kotlinx.android.synthetic.main.activity_movie_details.*


class MovieDetailsActivity : AppCompatActivity() {
    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, MovieDetailsActivity::class.java)
        }
    }
    lateinit var mMoviePlayer: ExoPlayer
    lateinit var mCastAdapter: CastAdapter
    val mediaItem = MediaItem.fromUri("https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/VolkswagenGTIReview.mp4")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
        setUpCastRecyclerView()
        initializePlayer()
    }

    private fun setUpCastRecyclerView() {
        mCastAdapter = CastAdapter()
        rvCast.adapter = mCastAdapter


    }

    private fun initializePlayer() {
        mMoviePlayer = ExoPlayer.Builder(this).build()
        pvMovie.player = mMoviePlayer
        mMoviePlayer.setMediaItem(mediaItem)
        mMoviePlayer.prepare()
        mMoviePlayer.play()

    }

}