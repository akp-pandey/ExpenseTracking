package com.example.trackyourexpense.modules.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.trackyourexpense.R
import com.example.trackyourexpense.extension.makeLinks
import com.example.trackyourexpense.modules.bottomnavigation.BottomNavigationView
import com.example.trackyourexpense.modules.signup.SignupActivity
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        setUp()
    }

    private fun setUp() {
        tvSignUp.makeLinks(Pair("Sign Up",View.OnClickListener {
                showSignUpActivity()
        }))
        btnLogin.setOnClickListener {
            val intent=Intent(this,BottomNavigationView::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun showSignUpActivity() {
        val intent=Intent(this,SignupActivity::class.java)
        startActivity(intent)
    }
}