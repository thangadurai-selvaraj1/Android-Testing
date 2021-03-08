package com.thangadurai.testing

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class SignUpPageValidationTest {

    @Test
    fun `Username empty return false`() {
        val result = SignUpPageValidation.signUpPageValidation(
            "", "123", "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password empty return false`() {
        val result = SignUpPageValidation.signUpPageValidation(
            "hai", "", "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `confirm password empty return false`() {
        val result = SignUpPageValidation.signUpPageValidation(
            "123", "123", ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password and confirm password not match return false`() {
        val result = SignUpPageValidation.signUpPageValidation(
            "123", "123", "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password and confirm password less than 2 return False`() {
        val result = SignUpPageValidation.signUpPageValidation(
            "123", "1", "1"
        )
        assertThat(result).isFalse()
    }


}