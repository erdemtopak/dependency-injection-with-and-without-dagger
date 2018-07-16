package com.erdem.withoutdagger.di

import com.erdem.withoutdagger.core.DaggerSimpleApp
import com.erdem.withoutdagger.data.UserDatabase
import com.erdem.withoutdagger.data.UserRepository
import com.erdem.withoutdagger.util.ResourceHelper

object AppDependencyProviderImpl : AppDependencyProvider {

    override fun provideResourceHelper(): ResourceHelper {
        return ResourceHelper(DaggerSimpleApp.instance)
    }

    override fun provideUserRepository(): UserRepository {
        return UserDatabase(DaggerSimpleApp.instance)
    }
}