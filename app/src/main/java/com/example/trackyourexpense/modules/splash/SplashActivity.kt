package com.example.trackyourexpense.modules.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.trackyourexpense.R
import com.example.trackyourexpense.modules.onboarding.OnboardingActivity
import com.example.trackyourexpense.modules.signin.SignInActivity
import com.example.trackyourexpense.modules.signup.SignupActivity

class SplashActivity : AppCompatActivity() {
    private val firstTime:Boolean=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        delayActivity()
    }
    private fun delayActivity() {
        Handler().postDelayed(Runnable {
            if (firstTime){
                val intent= Intent(this, OnboardingActivity::class.java)
                startActivity(intent)
            }else{
                val intent= Intent(this, SignInActivity::class.java)
                startActivity(intent)
            }

            this.finish()
        },3000)
    }
}