package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestPalindromicSubstringTest {

    private LongestPalindromicSubstring it = new LongestPalindromicSubstring();

    @Test
    void test0() {
        assertThat(it.longestPalindrome("a"))
                .isEqualTo("a");
    }

    @Test
    void test1() {
        assertThat(it.longestPalindrome("babad"))
                .isEqualTo("bab");
    }

    @Test
    void test2() {
        assertThat(it.longestPalindrome("cbbd"))
                .isEqualTo("bb");
    }
}