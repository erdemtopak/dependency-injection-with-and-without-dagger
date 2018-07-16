package com.erdem.daggersample

object CalculationHelper : ICalculationHelper {

    override fun sum(first: Int, second: Int): Int {
        return first + second
    }
}