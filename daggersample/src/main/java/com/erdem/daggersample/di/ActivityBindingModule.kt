package com.erdem.daggersample.di

import com.erdem.daggersample.ui.complex.UserActivity
import com.erdem.daggersample.ui.complex.UserModule
import com.erdem.daggersample.ui.simple.MainActivity
import com.erdem.daggersample.ui.simple.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [UserModule::class])
    abstract fun userActivity(): UserActivity

}