package com.example.unittest_multiasset


import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    fun getFirstData() : String {
        return "Android "
    }

    fun getSecondData() : String {
        return "Android"
    }

    @Test
    fun isEquals() {
        assertEquals(getFirstData(), getSecondData())
    }
}
class EmailVaildatorTest {


    @Test
    fun emailValidator_CorrectEmailSubDomain() {
        assertTrue(EmailValidator.isValidEmail("name@email.co.id"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername() {
        assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyStringe() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail() {

        assertFalse(EmailValidator.isValidEmail(null))
    }


}