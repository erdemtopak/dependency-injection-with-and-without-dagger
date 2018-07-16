package com.erdem.daggersample

import java.util.Random

class UserDatabase : UserRepository {

    override fun isEmailValid(email: String): Boolean {
        return email.length > 3 && Random().nextInt(10) == 5
    }
}