package com.padc.themoviebookingapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.exoplayer2.ExoPlayer
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.activities.MovieDetailsActivity
import com.padc.themoviebookingapp.adapters.MovieAdapter
import com.padc.themoviebookingapp.adapters.ComingSoonMovieAdapter
import com.padc.themoviebookingapp.delegates.MovieViewHolderDelegate
import kotlinx.android.synthetic.main.fragment_movies.*
import me.relex.circleindicator.CircleIndicator2
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class MoviesFragment: Fragment(), MovieViewHolderDelegate {


    lateinit var mMovieAdapter: MovieAdapter
    lateinit var mCSMovieAdapter: ComingSoonMovieAdapter
    lateinit var mView: View


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mView = inflater.inflate(R.layout.fragment_movies, container, false)
        return mView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpMovieToggleButton()
        setupCarousel()
        setUpMovieRecyclerView(true)
    }

    private fun setUpMovieToggleButton() {


        toggleBtnGroup.addOnButtonCheckedListener { toggleButtonGroup, checkedId, isChecked ->

            if (isChecked) {
                when (checkedId) {
                    R.id.btnNowShowing -> setUpMovieRecyclerView(true)

                    R.id.btnComingSoon -> setUpMovieRecyclerView(false)
                }

            }
        }
        }


    private fun setupCarousel(){
        val carousel: ImageCarousel = mView.findViewById(R.id.carouselOfferBoard)
        val indicator: CircleIndicator2 = mView.findViewById((R.id.dotsIndicatorOfferBoard))

// Register lifecycle. For activity this will be lifecycle/getLifecycle() and for fragment it will be viewLifecycleOwner/getViewLifecycleOwner().
        carousel.registerLifecycle(lifecycle)

        val list = mutableListOf<CarouselItem>()

// Just image drawable
        list.add(
            CarouselItem(
                imageDrawable = R.drawable.offer_board
            )
        )
        list.add(
            CarouselItem(
                imageDrawable = R.drawable.offer_board
            )
        )
        list.add(
            CarouselItem(
                imageDrawable = R.drawable.offer_board
            )
        )
        list.add(
            CarouselItem(
                imageDrawable = R.drawable.offer_board
            )
        )



        carousel.setData(list)
        carousel.setIndicator(indicator)
//        binding.carousel4.setIndicator(binding.customIndicator)

//        dotsIndicatorOfferBoard.attachTo(carouselOfferBoard)

    }

    override fun onTapMovie() {
        startActivity(MovieDetailsActivity.newIntent(requireContext()))
    }

    private fun setUpMovieRecyclerView(movieType: Boolean) {

        mMovieAdapter = MovieAdapter(this)
        mCSMovieAdapter = ComingSoonMovieAdapter(this)

        if (movieType)
        {
            rvMovie.adapter = mMovieAdapter
        }
        else
        {
            rvMovie.adapter = mCSMovieAdapter
        }
    }


    }

