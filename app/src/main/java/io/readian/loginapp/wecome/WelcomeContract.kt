package io.readian.loginapp.wecome

interface WelcomeContract {

  interface View

  interface Presenter {
    fun onLoginClicked()

    fun onSignUpClicked()

    fun onSkipClicked()
  }
}