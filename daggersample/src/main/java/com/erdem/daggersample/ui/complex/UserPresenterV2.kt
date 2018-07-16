package com.erdem.daggersample.ui.complex

import com.erdem.daggersample.util.ResourceHelper
import javax.inject.Inject

class UserPresenterV2 @Inject constructor(
        val navigator: UserContract.Navigator,
        val resourceHelper: ResourceHelper
) : UserContract.Presenter {

    override fun onAccountDetails() {
        navigator.navigateOnAccountDetails()
    }

}