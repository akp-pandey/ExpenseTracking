package com.example.trackyourexpense.modules.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trackyourexpense.R
import com.example.trackyourexpense.adapter.ViewPagerAdapter
import com.example.trackyourexpense.modules.signin.SignInActivity
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        vpOnboarding.adapter= ViewPagerAdapter(this)
        btnSkip.setOnClickListener{
            val intent=Intent(this,SignInActivity::class.java)
            startActivity(intent)
        }
    }
}