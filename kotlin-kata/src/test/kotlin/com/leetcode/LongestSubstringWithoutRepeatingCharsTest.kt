package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LongestSubstringWithoutRepeatingCharsTest {

    private val target = LongestSubstringWithoutRepeatingChars()

    @Test
    fun test0() {
        assertThat(target.lengthOfLongestSubstring(""))
            .isEqualTo(0)
        assertThat(target.lengthOfLongestSubstring("a"))
            .isEqualTo(1)
    }

    @Test
    fun test1() {
        // Input: s = "abcabcbb"
        // Output: 3
        // Explanation: The answer is "abc", with the length of 3.
        assertThat(target.lengthOfLongestSubstring("abcabcbb"))
            .isEqualTo(3)
    }

    @Test
    fun test2() {
        // Input: s = "bbbbb"
        // Output: 1
        // Explanation: The answer is "b", with the length of 1.
        assertThat(target.lengthOfLongestSubstring("bbbbb"))
            .isEqualTo(1)
    }

    @Test
    fun test3() {
        // Input: s = "pwwkew"
        // Output: 3
        // Explanation: The answer is "wke", with the length of 3.
        // Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
        assertThat(target.lengthOfLongestSubstring("pwwkew"))
            .isEqualTo(3)
    }

    @Test
    fun test4() {
        assertThat(target.lengthOfLongestSubstring("au"))
            .isEqualTo(2)
    }

    @Test
    fun test5() {
        assertThat(target.lengthOfLongestSubstring("asdf"))
            .isEqualTo(4)
    }

    @Test
    fun test6() {
        assertThat(target.lengthOfLongestSubstring("dvdf"))
            .isEqualTo(3)
    }

    @Test
    fun test7() {
        assertThat(target.lengthOfLongestSubstring("anviaj"))
            .isEqualTo(5)
    }

    @Test
    fun test8() {
        assertThat(target.lengthOfLongestSubstring("   "))
            .isEqualTo(1)
    }

    @Test
    fun test9() {
        assertThat(target.lengthOfLongestSubstring("hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"))
            .isEqualTo(55)
    }
}