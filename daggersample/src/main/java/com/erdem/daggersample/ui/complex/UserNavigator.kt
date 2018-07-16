package com.erdem.daggersample.ui.complex

import android.content.Context
import android.util.Log
import javax.inject.Inject

class UserNavigator @Inject constructor(activityContext: Context) : UserContract.Navigator {

    override fun navigateOnAccountDetails() {
        Log.d("##", "navigateOnAccountDetails")
    }

}