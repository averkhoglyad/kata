package com.codewars;

import org.junit.jupiter.api.Test;
import test.ArrayUtil;

import static org.assertj.core.api.Assertions.assertThat;

class FindOddTest {
    @Test
    public void findTest() {
        assertThat(FindOdd.findIt(ArrayUtil.intArrayOf(20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5)))
                .isEqualTo(5);
        assertThat(FindOdd.findIt(ArrayUtil.intArrayOf(1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5)))
                .isEqualTo(-1);
        assertThat(FindOdd.findIt(ArrayUtil.intArrayOf(20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5)))
                .isEqualTo(5);
        assertThat(FindOdd.findIt(ArrayUtil.intArrayOf(10)))
                .isEqualTo(10);
        assertThat(FindOdd.findIt(ArrayUtil.intArrayOf(1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1)))
                .isEqualTo(10);
        assertThat(FindOdd.findIt(ArrayUtil.intArrayOf(5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10)))
                .isOne();
    }
}