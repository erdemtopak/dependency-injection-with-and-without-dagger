package com.erdem.withoutdagger.ui.complex

import com.erdem.withoutdagger.di.AppDependencyProvider

class UserDependencyProviderImpl(private val appDependencyProvider: AppDependencyProvider) : UserDependencyProvider {

    override fun provideNavigator(activity: UserActivity): UserContract.Navigator {
        return when (UserActivity.getNavigatorType(activity.intent)) {
            0 -> UserNavigator(activity)
            1 -> UserNavigatorV2(activity)
            else -> UserNavigator(activity)
        }
    }

    override fun providePresenter(activity: UserActivity): UserContract.Presenter {
        return when (UserActivity.getPresenterType(activity.intent)) {
            0 -> UserPresenter(provideNavigator(activity), appDependencyProvider.provideResourceHelper())
            1 -> UserPresenterV2(provideNavigator(activity), appDependencyProvider.provideResourceHelper())
            else -> UserPresenter(provideNavigator(activity), appDependencyProvider.provideResourceHelper())
        }
    }
}