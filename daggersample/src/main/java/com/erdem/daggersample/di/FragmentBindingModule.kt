package com.erdem.daggersample.di

import com.erdem.daggersample.ui.complex.account.AccountFragment
import com.erdem.daggersample.ui.complex.account.AccountModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [AccountModule::class])
    abstract fun accountFragment(): AccountFragment

}