package com.leetcode

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class ValidAnagramTest {
    private val it = ValidAnagram()

    @Test
    fun test1() {
//        Input: s = "anagram", t = "nagaram"
//        Output: true

        val res = it.isAnagram("anagram", "nagaram")
        Assertions.assertThat(res)
            .isTrue()
    }

    @Test
    fun test2() {
//        Input: s = "rat", t = "car"
//        Output: false

        val res = it.isAnagram("rat", "car")
        Assertions.assertThat(res)
            .isFalse()
    }
}