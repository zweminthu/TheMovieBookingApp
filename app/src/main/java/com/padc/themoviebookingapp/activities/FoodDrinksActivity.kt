package com.padc.themoviebookingapp.activities


import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.padc.themoviebookingapp.R
import com.padc.themoviebookingapp.adapters.FoodDrinksAdapter
import com.padc.themoviebookingapp.adapters.ItemListAdapter
import com.padc.themoviebookingapp.dummy.dummyFoodDrinksList
import kotlinx.android.synthetic.main.activity_food_drinks.*
import kotlinx.android.synthetic.main.food_drinks_bottom_sheet.flFoodDrinksCartInBS

class FoodDrinksActivity: AppCompatActivity() {

    private lateinit var mFoodDrinksAdapter: FoodDrinksAdapter
    private lateinit var mItemListAdapter: ItemListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_drinks)
        setUpBackListener()
        setUpFoodDrinksRecyclerView()
        setUpFoodDrinksTabLayout()
        setUpGoToCheckoutPageButton()
        setUpBottomSheetDialog()


    }
    private fun setUpFoodDrinksRecyclerView() {
        mFoodDrinksAdapter = FoodDrinksAdapter()
        rvFoodDrinks.adapter = mFoodDrinksAdapter


    }
    private fun setUpFoodDrinksTabLayout() {
        dummyFoodDrinksList.forEach {
            tlFoodsDrinks.newTab().apply {
                text = it
                tlFoodsDrinks.addTab(this)
            }
        }
    }
    private fun setUpBackListener(){
        btnBackToSelectSeat.setOnClickListener(){
            super.onBackPressed()
        }
    }
    private fun setUpGoToCheckoutPageButton(){
        flPriceCheckout.setOnClickListener {
            val intent = Intent(this, CheckoutActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setUpBottomSheetDialog(){
        val bottomSheetDialog = BottomSheetDialog(this)
        bottomSheetDialog.setContentView(R.layout.food_drinks_bottom_sheet)
        val rvFoodDrinks = bottomSheetDialog.findViewById<RecyclerView>(R.id.rvItemList)
        if (rvFoodDrinks != null) {
                mItemListAdapter = ItemListAdapter()
                rvFoodDrinks.adapter = mItemListAdapter
            }
        flFoodDrinksCart.setOnClickListener {
            bottomSheetDialog.show()
        }
        val button = findViewById<FrameLayout>(R.id.flFoodDrinksCartInBS)
//        button.setOnClickListener{
//            bottomSheetDialog.hide()
//        }
    }
}