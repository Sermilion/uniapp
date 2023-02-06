package io.readian.loginapp.login

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import io.readian.loginapp.R


open class LoginScreen : AppCompatActivity(), LoginContract.View {

  private val presenter: LoginPresenter = LoginPresenter()

  private lateinit var logIn: Button

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.welcome_login)

    logIn = findViewById(R.id.button_login)

    logIn.setOnClickListener {
      presenter.onLoginClicked()
    }

  }
}