package io.readian.loginapp.wecome

import android.content.Intent
import androidx.core.content.ContextCompat.startActivity

class WelcomePresenter : WelcomeContract.Presenter, WelcomeLogin(){

    override fun onLoginClicked() {
        val loginIntent = Intent(this, WelcomeLogin::class.java)
        startActivity(loginIntent)
    }

    override fun onSignUpClicked() {

    }

    override fun onSkipClicked() {

    }
}