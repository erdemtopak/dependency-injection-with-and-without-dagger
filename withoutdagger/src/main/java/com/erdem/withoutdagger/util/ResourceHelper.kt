package com.erdem.withoutdagger.util

import android.app.Application
import android.support.annotation.StringRes

class ResourceHelper constructor(val context: Application) {


    fun getString(@StringRes resId: Int): String {
        return context.resources.getString(resId)
    }
}