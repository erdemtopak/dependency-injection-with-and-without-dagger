package com.erdem.daggersample.ui.complex

import com.erdem.daggersample.di.ActivityScope
import com.erdem.daggersample.util.ResourceHelper
import dagger.Module
import dagger.Provides

@Module
abstract class UserModule {


    @Module
    companion object {

        @ActivityScope
        @JvmStatic
        @Provides
        fun provideUserNavigator(activity: UserActivity): UserContract.Navigator {
            return when (UserActivity.getNavigatorType(activity.intent)) {
                0 -> UserNavigator(activity)
                1 -> UserNavigatorV2(activity)
                else -> UserNavigator(activity)
            }
        }

        @ActivityScope
        @JvmStatic
        @Provides
        fun provideUserPresenter(
                activity: UserActivity,
                navigator: UserContract.Navigator,
                resourceHelper: ResourceHelper
        ): UserContract.Presenter {

            return when (UserActivity.getPresenterType(activity.intent)) {
                0 -> UserPresenter(navigator, resourceHelper)
                1 -> UserPresenterV2(navigator, resourceHelper)
                else -> UserPresenter(navigator, resourceHelper)
            }
        }

    }
}