package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestCommonPrefixTest {

    private final LongestCommonPrefix it = new LongestCommonPrefix();

    @Test
    void test0() {
        assertThat(it.longestCommonPrefix(new String[]{"flower", "flow", "flight"}))
                .isEqualTo("fl");
    }

    @Test
    void test1() {
        assertThat(it.longestCommonPrefix(new String[]{"dog","racecar","car"}))
                .isEqualTo("");
    }

}