package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ValidParenthesesTest {

    private val it = ValidParentheses()

    @Test
    fun test1() {
//        Input: s = "()"
//        Output: true

        assertThat(it.isValid("()"))
            .isTrue()
    }

    @Test
    fun test2() {
//        Input: s = "()[]{}"
//        Output: true

        assertThat(it.isValid("()[]{}"))
            .isTrue()
    }

    @Test
    fun test3() {
//        Input: s = "(]"
//        Output: false

        assertThat(it.isValid("(]"))
            .isFalse()
    }

    @Test
    fun test4() {
//        Input: s = "([])"
//        Output: true

        assertThat(it.isValid("([])"))
            .isTrue()
    }

    @Test
    fun test5() {
//        Input: s = "])}"
//        Output: false

        assertThat(it.isValid("])}"))
            .isFalse()
    }
}