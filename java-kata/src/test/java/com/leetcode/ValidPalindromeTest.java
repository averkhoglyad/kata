package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidPalindromeTest {

    private final ValidPalindrome it = new ValidPalindrome();

    @Test
    void test0() {
        var res = it.isPalindrome("a bba");
        assertThat(res)
                .isTrue();
    }

    @Test
    void test1() {
//        Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.

        var res = it.isPalindrome("A man, a plan, a canal: Panama");
        assertThat(res)
                .isTrue();
    }

    @Test
    void test2() {
//        Input: s = "race a car"
//        Output: false
//        Explanation: "raceacar" is not a palindrome.

        var res = it.isPalindrome("race a car");
        assertThat(res)
                .isFalse();
    }

    @Test
    void test3() {
//        Input: s = " "
//        Output: true
//        Explanation: s is an empty string "" after removing non-alphanumeric characters.
//                Since an empty string reads the same forward and backward, it is a palindrome.

        var res = it.isPalindrome("");
        assertThat(res)
                .isTrue();
    }

    @Test
    void test4() {
        var res = it.isPalindrome("ab");
        assertThat(res)
                .isFalse();
    }

    @Test
    void test5() {
        var res = it.isPalindrome(" ");
        assertThat(res)
                .isTrue();
    }

    @Test
    void test6() {
        var res = it.isPalindrome("a.");
        assertThat(res)
                .isTrue();
    }

    @Test
    void test7() {
        var res = it.isPalindrome(".,");
        assertThat(res)
                .isTrue();
    }

    @Test
    void test8() {
        var res = it.isPalindrome("0P");
        assertThat(res)
                .isFalse();
    }
}