package com.erdem.withoutdagger.di

import com.erdem.withoutdagger.ui.complex.UserDependencyProvider
import com.erdem.withoutdagger.ui.complex.UserDependencyProviderImpl
import com.erdem.withoutdagger.ui.complex.account.AccountDependencyProvider
import com.erdem.withoutdagger.ui.complex.account.AccountDependencyProviderImpl

object DependencyInjector {

    fun getAppDependencyProvider(): AppDependencyProvider {
        return AppDependencyProviderImpl
    }

    fun getUserDependencyProvider(): UserDependencyProvider {
        return UserDependencyProviderImpl(getAppDependencyProvider())
    }

    fun getAccountDependencyProvider(): AccountDependencyProvider {
        return AccountDependencyProviderImpl(getAppDependencyProvider())
    }


}