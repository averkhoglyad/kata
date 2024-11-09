package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static test.ArrayUtil.arrayOf;

class TwoSum2Test {

    private final TwoSum2 it = new TwoSum2();

    @Test
    void test0() {
        assertThat(it.twoSum(arrayOf(1, 2, 7, 11, 15), 9))
                .containsExactly(2, 3);
    }

    @Test
    void test1() {
        assertThat(it.twoSum(arrayOf(2, 7, 11, 15), 9))
                .containsExactly(1, 2);
    }

    @Test
    void test2() {
        assertThat(it.twoSum(arrayOf(2, 3, 4), 6))
                .containsExactly(1, 3);
    }

    @Test
    void test3() {
        assertThat(it.twoSum(arrayOf(-1, 0), -1))
                .containsExactly(1, 2);
    }

    @Test
    void test4() {
        assertThat(it.twoSum(arrayOf(1, 2, 3, 4, 4, 9, 56, 90), 8))
                .containsExactly(4, 5);
    }
}