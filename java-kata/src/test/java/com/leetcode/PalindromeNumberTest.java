package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeNumberTest {

    private PalindromeNumber it = new PalindromeNumber();

    @Test
    void test0() {
        assertThat(it.isPalindrome(0)).isTrue();
    }

    @Test
    void test1() {
        assertThat(it.isPalindrome(121)).isTrue();
    }

    @Test
    void test2() {
        assertThat(it.isPalindrome(-121)).isFalse();
    }

    @Test
    void test3() {
        assertThat(it.isPalindrome(321)).isFalse();
    }

    @Test
    void test4() {
        assertThat(it.isPalindrome(123)).isFalse();
    }

    @Test
    void test5() {
        assertThat(it.isPalindrome(123454321)).isTrue();
    }

    @Test
    void test6() {
        assertThat(it.isPalindrome(1234554321)).isTrue();
    }
}