package com.erdem.daggersample.di

import android.app.Application
import android.content.Context
import com.erdem.daggersample.data.UserDatabase
import com.erdem.daggersample.data.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class AppModule {

    @Binds
    abstract fun provideContext(application: Application): Context

    @Module
    companion object {

        @Provides
        @Singleton
        @JvmStatic
        fun provideRepository(context: Application): UserRepository {
            return UserDatabase(context)
        }
    }

}