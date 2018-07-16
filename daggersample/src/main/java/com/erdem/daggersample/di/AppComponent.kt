package com.erdem.daggersample.di

import android.app.Application
import com.erdem.daggersample.core.DaggerSimpleApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            ActivityBindingModule::class,
            FragmentBindingModule::class,
            AppModule::class
        ]
)
interface AppComponent : AndroidInjector<DaggerSimpleApp> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }
}