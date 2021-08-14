package com.example.trackyourexpense.modules.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.trackyourexpense.R
import kotlinx.android.synthetic.main.activity_bottom_navigation_view.*

class BottomNavigationView : AppCompatActivity() {

    private val rotaeOpen:Animation by lazy { AnimationUtils.loadAnimation(this,R.anim.rotate_open_anim) }
    private val rotaeClose:Animation by lazy { AnimationUtils.loadAnimation(this,R.anim.rotate_close_anim) }
    private val fromBottom:Animation by lazy { AnimationUtils.loadAnimation(this,R.anim.from_bottom) }
    private val toBottom:Animation by lazy { AnimationUtils.loadAnimation(this,R.anim.to_bottom) }
    private var isClicked:Boolean=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation_view)
        val navHostFragment=supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController=navHostFragment.navController
        bottomNavigationView.setupWithNavController(navController)

        setUp()

    }

    private fun setUp() {
        fabButton.setOnClickListener {
            setVisiblity(isClicked)
            setAnimation(isClicked)
            isClicked=!isClicked
        }

    }

    private fun setAnimation(clicked: Boolean) {
        if (!isClicked){
            ivTransaction.startAnimation(fromBottom)
            ivIncome.startAnimation(fromBottom)
            ivExpense.startAnimation(fromBottom)
            fabButton.startAnimation(rotaeOpen)
        }else{
            ivTransaction.startAnimation(toBottom)
            ivIncome.startAnimation(toBottom)
            ivExpense.startAnimation(toBottom)
            fabButton.startAnimation(rotaeClose)
        }
    }

    private fun setVisiblity(clicked: Boolean) {
        if (!clicked){
            ivExpense.visibility=View.VISIBLE
            ivIncome.visibility=View.VISIBLE
            ivTransaction.visibility=View.VISIBLE
        }else{
            ivExpense.visibility=View.VISIBLE
            ivIncome.visibility=View.VISIBLE
            ivTransaction.visibility=View.VISIBLE
        }
    }
}