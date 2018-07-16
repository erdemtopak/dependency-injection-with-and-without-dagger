package com.erdem.withoutdagger.data

interface UserRepository {

    fun isEmailValid(email: String): Boolean
}