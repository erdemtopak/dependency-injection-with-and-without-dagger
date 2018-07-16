package com.erdem.daggersample.nottestable

import com.erdem.daggersample.CalculationHelper
import com.erdem.daggersample.ISampleView
import com.erdem.daggersample.SampleView
import com.erdem.daggersample.UserDatabase
import com.erdem.daggersample.UserRepository

class NotTestableUseCase {

    val database: UserRepository = UserDatabase()
    val view: ISampleView = SampleView()

    fun isUserEmailValid(email: String) {
        if (database.isEmailValid(email)) {
            view.showSuccess()
        } else {
            view.showError()
        }
    }

    fun checkSumOfValuesEqualsTen(first: Int, second: Int) {
        if (CalculationHelper.sum(first, second) == 10) {
            view.showSuccess()
        } else {
            view.showError()
        }
    }

}