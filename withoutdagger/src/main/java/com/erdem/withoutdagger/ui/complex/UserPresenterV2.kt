package com.erdem.withoutdagger.ui.complex

import com.erdem.withoutdagger.util.ResourceHelper

class UserPresenterV2 constructor(
        val navigator: UserContract.Navigator,
        val resourceHelper: ResourceHelper
) : UserContract.Presenter {

    override fun onAccountDetails() {
        navigator.navigateOnAccountDetails()
    }

}