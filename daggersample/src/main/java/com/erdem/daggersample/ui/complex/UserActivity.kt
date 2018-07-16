package com.erdem.daggersample.ui.complex

import android.content.Context
import android.content.Intent
import android.util.Log
import com.erdem.daggersample.util.ResourceHelper2
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class UserActivity : DaggerAppCompatActivity(), UserContract.View {

    @Inject
    lateinit var presenter: UserContract.Presenter

    @Inject
    lateinit var resHelper2: ResourceHelper2

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