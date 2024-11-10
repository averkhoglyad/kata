package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MaximumSubarrayTest {

    private val target = MaximumSubarray()

    @Test
    fun test1() {
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: The subarray [4,-1,2,1] has the largest sum 6.

        val input = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
        assertThat(target.maxSubArray(input))
            .isEqualTo(6)
    }

    @Test
    fun test2() {
//        Input: nums = [1]
//        Output: 1
//        Explanation: The subarray [1] has the largest sum 1.

        val input = intArrayOf(1)
        assertThat(target.maxSubArray(input))
            .isEqualTo(1)
    }

    @Test
    fun test3() {
//        Input: nums = [5,4,-1,7,8]
//        Output: 23
//        Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

        val input = intArrayOf(5, 4, -1, 7, 8)
        assertThat(target.maxSubArray(input))
            .isEqualTo(23)
    }

    @Test
    fun test4() {
        var input = intArrayOf(-1)
        assertThat(target.maxSubArray(input))
            .isEqualTo(-1)
    }

    @Test
    fun test5() {
        var input = intArrayOf(-1, -2, -3)
        assertThat(target.maxSubArray(input))
            .isEqualTo(-1)
    }

    @Test
    fun test6() {
        var input = intArrayOf(-3, -2, -1)
        assertThat(target.maxSubArray(input))
            .isEqualTo(-1)
    }
}