package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreeSumTest {

    private val target = ThreeSum()

    @Test
    fun test0() {
        val result = target.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
        assertThat(result)
            .containsExactlyInAnyOrder(listOf(-1, -1, 2), listOf(-1, 0, 1))
    }

    @Test
    fun test1() {
        val result = target.threeSum(intArrayOf(0, 1, 1))
        assertThat(result)
            .isEmpty()
    }

    @Test
    fun test2() {
        val result = target.threeSum(intArrayOf(0, 0, 0))
        assertThat(result)
            .containsExactlyInAnyOrder(listOf(0, 0, 0))
    }

    @Test
    fun test3() {
        val result = target.threeSum(intArrayOf(-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6))
        assertThat(result)
            .containsExactlyInAnyOrder(
                listOf<Int>(-4, -2, 6),
                listOf<Int>(-4, 0, 4),
                listOf<Int>(-4, 1, 3),
                listOf<Int>(-4, 2, 2),
                listOf<Int>(-2, -2, 4),
                listOf<Int>(-2, 0, 2)
            )
    }
}