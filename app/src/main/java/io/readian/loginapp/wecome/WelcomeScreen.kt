package io.readian.loginapp.wecome

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import io.readian.loginapp.R
import io.readian.loginapp.login.LoginScreen

class WelcomeScreen : AppCompatActivity(), WelcomeContract.View {

  private val presenter: WelcomePresenter = WelcomePresenter()

  private lateinit var logIn: Button
  private lateinit var signUp: Button
  private lateinit var skip: Button

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    logIn = findViewById(R.id.button_login)
    signUp = findViewById(R.id.button_sign_up)
    skip = findViewById(R.id.button_skip)

    logIn.setOnClickListener {
      val loginIntent = Intent(this, LoginScreen::class.java)
      startActivity(loginIntent)
    }

    signUp.setOnClickListener {
      presenter.onSignUpClicked()
    }

    skip.setOnClickListener {
      presenter.onSkipClicked()
    }
  }
}