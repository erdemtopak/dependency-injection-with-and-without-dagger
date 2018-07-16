package com.erdem.withoutdagger.ui.complex

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.erdem.withoutdagger.di.DependencyInjector

class UserActivity : AppCompatActivity(), UserContract.View {

    lateinit var presenter: UserContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter = DependencyInjector.getUserDependencyProvider().providePresenter(this)
    }

    override fun showTitle(title: String) {
        Log.d("##", "showTitle")
    }

    companion object {

        private const val KEY_PRESENTER_TYPE = "PRESENTER_TYPE"
        private const val KEY_NAVIGATOR_TYPE = "NAVIGATOR_TYPE"

        fun newIntent(activityContext: Context, presenterType: Int, navigatorType: Int): Intent {
            return Intent(activityContext, UserActivity::class.java).apply {
                putExtra(KEY_PRESENTER_TYPE, presenterType)
                putExtra(KEY_NAVIGATOR_TYPE, navigatorType)
            }
        }

        fun getPresenterType(intent: Intent) = intent.getIntExtra(KEY_PRESENTER_TYPE, 0)

        fun getNavigatorType(intent: Intent) = intent.getIntExtra(KEY_NAVIGATOR_TYPE, 0)
    }

}