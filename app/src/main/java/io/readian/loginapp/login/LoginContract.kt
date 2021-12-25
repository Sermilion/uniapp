package io.readian.loginapp.login

interface LoginContract {

    interface View

    interface Presenter {
        fun onLoginClicked()

        fun onGoogleClicked()

        fun onFacebookClicked()
    }
}