package com.erdem.daggersample.ui.complex.account

import dagger.android.support.DaggerFragment
import javax.inject.Inject

class AccountFragment : DaggerFragment(), AccountContract.View {

    @Inject
    lateinit var viewModel: AccountContract.ViewModel

}