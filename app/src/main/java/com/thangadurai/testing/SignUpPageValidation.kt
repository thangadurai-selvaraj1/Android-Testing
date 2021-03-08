package com.thangadurai.testing

object SignUpPageValidation {

    fun signUpPageValidation(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean {

        if (username.isEmpty()) {
            return false
        }
        if (password.isEmpty()) {
            return false
        }
        if (confirmPassword.isEmpty()) {
            return false
        }
        if (password != confirmPassword) {
            return false
        }

        if (password.length < 2 || confirmPassword.length < 2) {
            return false
        }

        return true
    }

}