package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MajorityElementTest {
    private val it = MajorityElement()

    @Test
    fun test1() {
        val nums = intArrayOf(3, 2, 3)
        assertThat(it.majorityElement(nums))
            .isEqualTo(3)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 2, 1, 1, 1, 2, 2)
        assertThat(it.majorityElement(nums))
            .isEqualTo(2)
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1)
        assertThat(it.majorityElement(nums))
            .isEqualTo(1)
    }

    @Test
    fun test4() {
        val nums = intArrayOf(3, 3, 4)
        assertThat(it.majorityElement(nums))
            .isEqualTo(3)
    }
}