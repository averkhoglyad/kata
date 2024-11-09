package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClimbingStairsTest {

    private val target = ClimbingStairs()

    @Test
    fun test1() {
//        Input: n = 2
//        Output: 2
//        Explanation: There are two ways to climb to the top.
//        1. 1 step + 1 step
//        2. 2 steps

        assertThat(target.climbStairs(2))
            .isEqualTo(2)
    }

    @Test
    fun test2() {
//        Input: n = 3
//        Output: 3
//        Explanation: There are three ways to climb to the top.
//        1. 1 step + 1 step + 1 step
//        2. 1 step + 2 steps
//        3. 2 steps + 1 step

        assertThat(target.climbStairs(3))
            .isEqualTo(3)
    }

    @Test
    fun test3() {
        assertThat(target.climbStairs(4))
            .isEqualTo(5)
    }

    @Test
    fun test4() {
        assertThat(target.climbStairs(5))
            .isEqualTo(8)
    }

    @Test
    fun test6() {
        assertThat(target.climbStairs(6))
            .isEqualTo(13)
    }
}