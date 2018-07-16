package com.erdem.withoutdagger.core

import android.app.Application

class DaggerSimpleApp : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {

        @JvmStatic
        lateinit var instance: DaggerSimpleApp
    }
}