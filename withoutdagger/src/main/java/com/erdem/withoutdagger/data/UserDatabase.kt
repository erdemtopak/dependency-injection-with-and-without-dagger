package com.erdem.withoutdagger.data

import android.app.Application
import java.util.Random

class UserDatabase constructor(val context: Application) : UserRepository {

    override fun isEmailValid(email: String): Boolean {
        return email.length > 3 && Random().nextInt(10) == 5
    }
}