package com.erdem.daggersample

interface UserRepository {

    fun isEmailValid(email: String): Boolean
}