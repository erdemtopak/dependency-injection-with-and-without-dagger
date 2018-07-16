package com.erdem.withoutdagger.ui.simple

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.erdem.withoutdagger.R
import com.erdem.withoutdagger.data.UserRepository
import com.erdem.withoutdagger.di.DependencyInjector
import com.erdem.withoutdagger.util.ResourceHelper

class MainActivity : AppCompatActivity() {

    lateinit var userRepository: UserRepository

    lateinit var resourceHelper: ResourceHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userRepository = DependencyInjector.getAppDependencyProvider().provideUserRepository()
        resourceHelper = DependencyInjector.getAppDependencyProvider().provideResourceHelper()
    }
}
