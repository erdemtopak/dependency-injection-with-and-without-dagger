package com.erdem.withoutdagger.ui.complex.account

import android.content.Context
import android.support.v4.app.Fragment
import com.erdem.withoutdagger.di.DependencyInjector

class AccountFragment : Fragment(), AccountContract.View {

    lateinit var viewModel: AccountContract.ViewModel

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        viewModel = DependencyInjector.getAccountDependencyProvider().provideViewModel()

    }

}