package com.erdem.withoutdagger.di

import com.erdem.withoutdagger.data.UserRepository
import com.erdem.withoutdagger.util.ResourceHelper

interface AppDependencyProvider {

    fun provideResourceHelper(): ResourceHelper

    fun provideUserRepository(): UserRepository
}