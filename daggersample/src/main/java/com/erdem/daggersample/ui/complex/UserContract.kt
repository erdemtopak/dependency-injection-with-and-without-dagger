package com.erdem.daggersample.ui.complex

interface UserContract {

    interface View {

        fun showTitle(title: String)
    }

    interface Presenter {

        fun onAccountDetails()
    }

    interface Navigator {

        fun navigateOnAccountDetails()
    }
}