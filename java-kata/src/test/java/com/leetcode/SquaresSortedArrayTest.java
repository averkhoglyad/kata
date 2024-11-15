package com.leetcode;

import org.junit.jupiter.api.Test;
import test.ArrayUtil;

import static org.assertj.core.api.Assertions.assertThat;

class SquaresSortedArrayTest {

    private final SquaresSortedArray it = new SquaresSortedArray();

    @Test
    void test1() {
        assertThat(it.sortedSquares(ArrayUtil.intArrayOf(-4, -1, 0, 3, 10)))
                .containsExactly(0, 1, 9, 16, 100);
    }

    @Test
    void test2() {
        assertThat(it.sortedSquares(ArrayUtil.intArrayOf(-7, -3, 2, 3, 11)))
                .containsExactly(4, 9, 9, 49, 121);
    }

    @Test
    void test3() {
        assertThat(it.sortedSquares(ArrayUtil.intArrayOf(-1)))
                .containsExactly(1);
    }
}