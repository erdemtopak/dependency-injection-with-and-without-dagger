package com.erdem.daggersample.data

import android.app.Application
import java.util.Random
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserDatabase @Inject constructor(val context: Application) : UserRepository {

    override fun isEmailValid(email: String): Boolean {
        return email.length > 3 && Random().nextInt(10) == 5
    }
}