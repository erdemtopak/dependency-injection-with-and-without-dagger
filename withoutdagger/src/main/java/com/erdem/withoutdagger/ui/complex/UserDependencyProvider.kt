package com.erdem.withoutdagger.ui.complex

interface UserDependencyProvider {

    fun provideNavigator(activity: UserActivity): UserContract.Navigator

    fun providePresenter(activity: UserActivity): UserContract.Presenter

}