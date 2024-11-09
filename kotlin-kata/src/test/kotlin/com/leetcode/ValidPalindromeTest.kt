package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ValidPalindromeTest {
    private val it = ValidPalindrome()

    @Test
    fun test0() {
        val res = it.isPalindrome("a bba")
        assertThat(res)
            .isTrue()
    }

    @Test
    fun test1() {
//        Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.

        val res = it.isPalindrome("A man, a plan, a canal: Panama")
        assertThat(res)
            .isTrue()
    }

    @Test
    fun test2() {
//        Input: s = "race a car"
//        Output: false
//        Explanation: "raceacar" is not a palindrome.

        val res = it.isPalindrome("race a car")
        assertThat(res)
            .isFalse()
    }

    @Test
    fun test3() {
//        Input: s = " "
//        Output: true
//        Explanation: s is an empty string "" after removing non-alphanumeric characters.
//                Since an empty string reads the same forward and backward, it is a palindrome.

        val res = it.isPalindrome("")
        assertThat(res)
            .isTrue()
    }

    @Test
    fun test4() {
        val res = it.isPalindrome("ab")
        assertThat(res)
            .isFalse()
    }

    @Test
    fun test5() {
        val res = it.isPalindrome(" ")
        assertThat(res)
            .isTrue()
    }

    @Test
    fun test6() {
        val res = it.isPalindrome("a.")
        assertThat(res)
            .isTrue()
    }

    @Test
    fun test7() {
        val res = it.isPalindrome(".,")
        assertThat(res)
            .isTrue()
    }

    @Test
    fun test8() {
        val res = it.isPalindrome("0P")
        assertThat(res)
            .isFalse()
    }
}