package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static test.ArrayUtil.arrayOf;

class MaximumSubarrayTest {

    private final MaximumSubarray target = new MaximumSubarray();

    @Test
    void test0() {
        assertThat(target.maxSubArray(null))
                .isEqualTo(0);
        assertThat(target.maxSubArray(new int[0]))
                .isEqualTo(0);
    }

    @Test
    void test1() {
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: The subarray [4,-1,2,1] has the largest sum 6.

        var input = arrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4);
        assertThat(target.maxSubArray(input))
                .isEqualTo(6);
    }

    @Test
    void test2() {
//        Input: nums = [1]
//        Output: 1
//        Explanation: The subarray [1] has the largest sum 1.

        var input = arrayOf(1);
        assertThat(target.maxSubArray(input))
                .isEqualTo(1);
    }

    @Test
    void test3() {
//        Input: nums = [5,4,-1,7,8]
//        Output: 23
//        Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

        var input = arrayOf(5, 4, -1, 7, 8);
        assertThat(target.maxSubArray(input))
                .isEqualTo(23);
    }

    @Test
    void test4() {
        var input = arrayOf(-1);
        assertThat(target.maxSubArray(input))
                .isEqualTo(-1);
    }

    @Test
    void test5() {
        var input = arrayOf(-1, -2, -3);
        assertThat(target.maxSubArray(input))
                .isEqualTo(-1);
    }

    @Test
    void test6() {
        var input = arrayOf(-3, -2, -1);
        assertThat(target.maxSubArray(input))
                .isEqualTo(-1);
    }
}