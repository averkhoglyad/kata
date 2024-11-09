package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestSubstringWithoutRepeatingCharsTest {


    final LongestSubstringWithoutRepeatingChars it = new LongestSubstringWithoutRepeatingChars();

    @Test
    void test0() {
        assertThat(it.lengthOfLongestSubstring(""))
                .isEqualTo(0);
        assertThat(it.lengthOfLongestSubstring("a"))
                .isEqualTo(1);
    }

    @Test
    void test1() {
        // Input: s = "abcabcbb"
        // Output: 3
        // Explanation: The answer is "abc", with the length of 3.
        assertThat(it.lengthOfLongestSubstring("abcabcbb"))
                .isEqualTo(3);

    }

    @Test
    void test2() {
        // Input: s = "bbbbb"
        // Output: 1
        // Explanation: The answer is "b", with the length of 1.
        assertThat(it.lengthOfLongestSubstring("bbbbb"))
                .isEqualTo(1);
    }

    @Test
    void test3() {
        // Input: s = "pwwkew"
        // Output: 3
        // Explanation: The answer is "wke", with the length of 3.
        // Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
        assertThat(it.lengthOfLongestSubstring("pwwkew"))
                .isEqualTo(3);
    }

    @Test
    void test4() {
        assertThat(it.lengthOfLongestSubstring("au"))
                .isEqualTo(2);
    }

    @Test
    void test5() {
        assertThat(it.lengthOfLongestSubstring("asdf"))
                .isEqualTo(4);
    }

    @Test
    void test6() {
        assertThat(it.lengthOfLongestSubstring("dvdf"))
                .isEqualTo(3);
    }

    @Test
    void test7() {
        assertThat(it.lengthOfLongestSubstring("anviaj"))
                .isEqualTo(5);
    }

    @Test
    void test8() {
        assertThat(it.lengthOfLongestSubstring("   "))
                .isEqualTo(1);
    }

    @Test
    void test9() {
        assertThat(it.lengthOfLongestSubstring("hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"))
                .isEqualTo(55);
    }
}