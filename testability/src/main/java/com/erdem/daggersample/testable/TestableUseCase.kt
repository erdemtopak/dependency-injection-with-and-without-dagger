package com.erdem.daggersample.testable

import com.erdem.daggersample.ICalculationHelper
import com.erdem.daggersample.ISampleView
import com.erdem.daggersample.UserRepository

class TestableUseCase(
        val database: UserRepository,
        val view: ISampleView,
        val calculationHelper: ICalculationHelper
) {

    fun isUserEmailValid(email: String) {
        if (database.isEmailValid(email)) {
            view.showSuccess()
        } else {
            view.showError()
        }
    }

    fun checkSumOfValuesEqualsTen(first: Int, second: Int) {
        if (calculationHelper.sum(first, second) == 10) {
            view.showSuccess()
        } else {
            view.showError()
        }
    }

}