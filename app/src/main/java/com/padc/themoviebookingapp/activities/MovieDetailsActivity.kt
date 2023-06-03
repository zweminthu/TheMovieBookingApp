package com.padc.themoviebookingapp.activities
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.ui.PlayerView
import com.google.android.exoplayer2.util.Log
import com.google.common.collect.ImmutableList
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.adapters.CastAdapter
import kotlinx.android.synthetic.main.activity_movie_details.*


class MovieDetailsActivity : AppCompatActivity(),  Player.Listener {
    companion object {
        private const val TAG = "MovieDetailsActivity"
        fun newIntent(context: Context, isUpcoming: Boolean): Intent {
            return Intent(context, MovieDetailsActivity::class.java).putExtra("isUpcoming", isUpcoming )
        }
    }
    private lateinit var player: ExoPlayer
    private lateinit var playerView: PlayerView
    private lateinit var progressBar: ProgressBar
    private lateinit var mCastAdapter: CastAdapter


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
        setUpCastRecyclerView()
        progressBar = findViewById(R.id.pbMovie)

        // restore play state on Rotation
        if (savedInstanceState != null) {
            if (savedInstanceState.getInt("mediaItem") != 0) {
                val restoredMediaItem = savedInstanceState.getInt("mediaItem")
                val seekTime = savedInstanceState.getLong("SeekTime")
                player.seekTo(restoredMediaItem, seekTime)
                player.play()
            }
        }
        btnBooking.setOnClickListener {
            val intent = Intent(this, SelectCinemaActivity::class.java)
            startActivity(intent)
        }

        isComingSoonMovie()

        setUpBackListener()

    }

    private fun setUpBackListener(){
        btnBackToMain.setOnClickListener {
            super.onBackPressed()
        }
    }

    private fun isComingSoonMovie(){
        val isUpcoming = intent.getBooleanExtra("isUpcoming", false)
        if (isUpcoming)
        {
            flNotification.visibility = View.VISIBLE
            btnBooking.visibility = View.GONE
        }
        else
        {
            flNotification.visibility = View.GONE
            btnBooking.visibility = View.VISIBLE
        }
    }

    private fun addMP4Files() {
        val mediaItem = MediaItem.fromUri(getString(R.string.media_url_mp4))
        val mediaItem2 = MediaItem.fromUri(getString(R.string.myTestMp4))
        val newItems: List<MediaItem> = ImmutableList.of(
            mediaItem,
            mediaItem2
        )
        player.addMediaItems(newItems)
        player.prepare()
    }

    private fun setupPlayer() {
        player = ExoPlayer.Builder(this).build()
        playerView = findViewById(R.id.pvMovie)
        playerView.player = player
        player.addListener(this)
    }

    override fun onStop() {
        super.onStop()
        player.release()
    }

    override fun onResume() {
        super.onResume()
        setupPlayer()
        addMP4Files()
    }

    // handle loading
    override fun onPlaybackStateChanged(state: Int) {
        when (state) {
            Player.STATE_BUFFERING -> {
                progressBar.visibility = View.VISIBLE

            }
            Player.STATE_READY -> {
                progressBar.visibility = View.INVISIBLE
            }
        }
    }

    // save details if Activity is destroyed
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState: " + player.currentPosition)
        // current play position
        outState.putLong("SeekTime", player.currentPosition)
        // current mediaItem
        outState.putInt("mediaItem", player.currentMediaItemIndex)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onSaveInstanceState: " + player.currentPosition)
    }

    private fun setUpCastRecyclerView() {
        mCastAdapter = CastAdapter()
        rvCast.adapter = mCastAdapter


    }

}