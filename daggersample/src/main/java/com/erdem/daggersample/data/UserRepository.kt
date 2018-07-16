package com.erdem.daggersample.data

interface UserRepository {

    fun isEmailValid(email: String): Boolean
}