package com.leetcode;

import org.junit.jupiter.api.Test;
import test.ArrayUtil;

import static org.assertj.core.api.Assertions.assertThat;

class SlidingWindowMaximumTest {

    final SlidingWindowMaximum it = new SlidingWindowMaximum();

    @Test
    void test1() {
        /*
        Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
        Output: [3,3,5,5,6,7]
        Explanation:
        Window position                Max
        ---------------               -----
        [1  3  -1] -3  5  3  6  7       3
         1 [3  -1  -3] 5  3  6  7       3
         1  3 [-1  -3  5] 3  6  7       5
         1  3  -1 [-3  5  3] 6  7       5
         1  3  -1  -3 [5  3  6] 7       6
         1  3  -1  -3  5 [3  6  7]      7
         */
        assertThat(it.maxSlidingWindow(ArrayUtil.intArrayOf(1, 3, -1, -3, 5, 3, 6, 7), 3))
                .containsExactly(3, 3, 5, 5, 6, 7);
    }

    @Test
    void test2() {
        assertThat(it.maxSlidingWindow(ArrayUtil.intArrayOf(1), 1))
                .containsExactly(1);
    }

    @Test
    void test3() {
        assertThat(it.maxSlidingWindow(ArrayUtil.intArrayOf(9, 10, 9, -7, -4, -8, 2, -6), 5))
                .containsExactly(10, 10, 9, 2);
    }
}