package com.example.trackyourexpense.modules.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.trackyourexpense.R
import com.example.trackyourexpense.extension.makeLinks
import com.example.trackyourexpense.modules.signin.SignInActivity
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        setUp()

    }

    private fun setUp() {
        tvLogin.makeLinks(Pair("Login",View.OnClickListener {
            showSiginActivity()
        }))
    }

    private fun showSiginActivity() {
        val intent=Intent(this,SignInActivity::class.java)
        startActivity(intent)
        finish()
    }


}