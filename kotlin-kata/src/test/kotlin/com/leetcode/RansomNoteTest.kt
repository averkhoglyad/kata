package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RansomNoteTest {
    private val it = RansomNote()

    @Test
    fun test1() {
//        Input: ransomNote = "a", magazine = "b"
//        Output: false

        assertThat(it.canConstruct("a", "b"))
            .isFalse()
    }

    @Test
    fun test2() {
//        Input: ransomNote = "aa", magazine = "ab"
//        Output: false

        assertThat(it.canConstruct("aa", "ab"))
            .isFalse()
    }

    @Test
    fun test3() {
//        Input: ransomNote = "aa", magazine = "aab"
//        Output: true

        assertThat(it.canConstruct("aa", "aab"))
            .isTrue()
    }
}