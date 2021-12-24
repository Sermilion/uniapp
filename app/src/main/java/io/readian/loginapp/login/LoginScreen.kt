package io.readian.loginapp.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.readian.loginapp.R


open class LoginScreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_login)

    }
}