package io.readian.loginapp.wecome

import android.content.Intent
import io.readian.loginapp.login.LoginScreen

class WelcomePresenter : WelcomeContract.Presenter, LoginScreen(){

    override fun onLoginClicked() {
        val loginIntent = Intent(this, LoginScreen::class.java)
        startActivity(loginIntent)
    }

    override fun onSignUpClicked() {

    }

    override fun onSkipClicked() {

    }
}