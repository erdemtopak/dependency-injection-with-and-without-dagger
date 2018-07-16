package com.erdem.withoutdagger.ui.complex.account

import com.erdem.withoutdagger.di.AppDependencyProvider

class AccountDependencyProviderImpl(val appDependencyProvider: AppDependencyProvider) : AccountDependencyProvider {

    override fun provideViewModel(): AccountViewModel {
        return AccountViewModel(appDependencyProvider.provideResourceHelper())
    }
}