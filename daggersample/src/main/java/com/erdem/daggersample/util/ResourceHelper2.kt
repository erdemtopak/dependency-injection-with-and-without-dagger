package com.erdem.daggersample.util

import android.app.Application
import android.support.annotation.StringRes
import javax.inject.Inject

class ResourceHelper2 @Inject constructor(val context: Application) {


    fun getString(@StringRes resId: Int): String {
        return context.resources.getString(resId)
    }
}