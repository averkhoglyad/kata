package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DecodeStringTest {

    final DecodeString it = new DecodeString();

    @Test
    void test1() {
//        Input: s = "3[a]2[bc]"
//        Output: "aaabcbc"
        assertThat(it.decodeString("3[a]2[bc]"))
                .isEqualTo("aaabcbc");
    }

    @Test
    void test2() {
//        Input: s = "3[a2[c]]"
//        Output: "accaccacc"
        assertThat(it.decodeString("3[a2[c]]"))
                .isEqualTo("accaccacc");
    }

    @Test
    void test3() {
//        Input: s = "2[abc]3[cd]ef"
//        Output: "abcabccdcdcdef"
        assertThat(it.decodeString("2[abc]3[cd]ef"))
                .isEqualTo("abcabccdcdcdef");
    }
}