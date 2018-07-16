package com.erdem.daggersample.ui.simple

import android.os.Bundle
import com.erdem.daggersample.R
import com.erdem.daggersample.data.UserRepository
import com.erdem.daggersample.util.ResourceHelper
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var userRepository: UserRepository

    @Inject
    lateinit var resourceHelper: ResourceHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
