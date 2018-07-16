package com.erdem.withoutdagger.ui.complex

import android.content.Context
import android.util.Log

class UserNavigator constructor(activityContext: Context) : UserContract.Navigator {

    override fun navigateOnAccountDetails() {
        Log.d("##", "navigateOnAccountDetails")
    }

}