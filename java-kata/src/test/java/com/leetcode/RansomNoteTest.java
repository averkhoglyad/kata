package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RansomNoteTest {

    private final RansomNote it = new RansomNote();

    @Test
    void test1() {
//        Input: ransomNote = "a", magazine = "b"
//        Output: false

        assertThat(it.canConstruct("a", "b"))
                .isFalse();
    }

    @Test
    void test2() {
//        Input: ransomNote = "aa", magazine = "ab"
//        Output: false

        assertThat(it.canConstruct("aa", "ab"))
                .isFalse();
    }

    @Test
    void test3() {
//        Input: ransomNote = "aa", magazine = "aab"
//        Output: true

        assertThat(it.canConstruct("aa", "aab"))
                .isTrue();
    }
}