package com.padc.themoviebookingapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.padc.themoviebookingapp.HorizontalMarginItemDecoration
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.adapters.OfferAdapter
import kotlinx.android.synthetic.main.fragment_movies.*
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class MoviesFragment: Fragment() {

    lateinit var mOfferAdapter: OfferAdapter

    lateinit var mView : View

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
//        setUpOfferViewPager()
        // Kotlin
        val carousel: ImageCarousel = mView.findViewById(R.id.carousel)

// Register lifecycle. For activity this will be lifecycle/getLifecycle() and for fragment it will be viewLifecycleOwner/getViewLifecycleOwner().
        carousel.registerLifecycle(lifecycle)

        val list = mutableListOf<CarouselItem>()

//// Image URL with caption
//        list.add(
//            CarouselItem(
//                imageUrl = "https://images.unsplash.com/photo-1532581291347-9c39cf10a73c?w=1080",
//                caption = "Photo by Aaron Wu on Unsplash"
//            )
//        )
//
//// Just image URL
//        list.add(
//            CarouselItem(
//                imageUrl = "https://images.unsplash.com/photo-1534447677768-be436bb09401?w=1080"
//            )
//        )

// Image URL with header
//        val headers = mutableMapOf<String, String>()
//        headers["header_key"] = "header_value"
//
//        list.add(
//            CarouselItem(
//                imageUrl = "https://images.unsplash.com/photo-1534447677768-be436bb09401?w=1080",
//                headers = headers
//            )
//        )
//
//// Image drawable with caption
//        list.add(
//            CarouselItem(
//                imageDrawable = R.drawable.movie_venom,
//                caption = "Photo by Kimiya Oveisi on Unsplash"
//            )
//        )
//
//// Just image drawable
        list.add(
            CarouselItem(
                imageDrawable = R.drawable.movie_venom
            )
        )

// ...

        carousel.setData(list)

//        setupCarousel()
    }

//    private fun setupCarousel(){
//
//        viewPagerVertical.offscreenPageLimit = 1
//
//        val nextItemVisiblePx = resources.getDimension(R.dimen.viewpager_next_item_visible)
//        val currentItemHorizontalMarginPx = resources.getDimension(R.dimen.viewpager_current_item_horizontal_margin)
//        val pageTranslationY = nextItemVisiblePx + currentItemHorizontalMarginPx
//        val pageTransformer = ViewPager2.PageTransformer { page: View, position: Float ->
//            page.translationY = pageTranslationY * position
//            page.scaleX = 1 - (0.25f * kotlin.math.abs(position))
//            page.alpha = 0.25f + (1 - kotlin.math.abs(position))
//        }
//        viewPagerVertical.setPageTransformer(pageTransformer)
//        val itemDecoration = HorizontalMarginItemDecoration(
//            this,
//            R.dimen.viewpager_current_item_horizontal_margin
//        )
//        viewPagerVertical.addItemDecoration(itemDecoration)
//    }

//    private fun setUpOfferViewPager(){
//        mOfferAdapter = OfferAdapter()
//        viewPagerOffer.adapter = mOfferAdapter
//    }

}