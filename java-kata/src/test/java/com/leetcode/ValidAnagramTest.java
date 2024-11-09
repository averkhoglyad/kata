package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidAnagramTest {

    private final ValidAnagram it = new ValidAnagram();

    @Test
    void test1() {
//        Input: s = "anagram", t = "nagaram"
//        Output: true

        var res = it.isAnagram("anagram", "nagaram");
        assertThat(res)
                .isTrue();
    }

    @Test
    void test2() {
//        Input: s = "rat", t = "car"
//        Output: false

        var res = it.isAnagram("rat", "car");
        assertThat(res)
                .isFalse();
    }

}