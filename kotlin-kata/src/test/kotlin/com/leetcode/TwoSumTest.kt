package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TwoSumTest {

    private val it = TwoSum()

    @Test
    fun test0() {
        // Input: nums = [2,7,11,15], target = 9
        // Output: [0,1]
        // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        assertThat(it.twoSum(intArrayOf(2, 7, 11, 15), 9))
            .containsExactlyInAnyOrder(0, 1)
    }

    @Test
    fun test1() {
        // Input: nums = [3,2,4], target = 6
        // Output: [1,2]
        assertThat(it.twoSum(intArrayOf(3, 2, 4), 6))
            .containsExactlyInAnyOrder(1, 2)
    }

    @Test
    fun test2() {
        // Input: nums = [3,3], target = 6
        // Output: [0,1]
        assertThat(it.twoSum(intArrayOf(3, 3), 6))
            .containsExactlyInAnyOrder(0, 1)
    }

}