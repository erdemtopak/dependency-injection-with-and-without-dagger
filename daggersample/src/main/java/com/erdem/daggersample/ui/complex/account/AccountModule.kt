package com.erdem.daggersample.ui.complex.account

import dagger.Binds
import dagger.Module

@Module
abstract class AccountModule {

    @Binds
    abstract fun bindViewModel(viewModel: AccountViewModel): AccountContract.ViewModel

}