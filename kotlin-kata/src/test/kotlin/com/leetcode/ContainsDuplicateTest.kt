package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContainsDuplicateTest {

    val it: ContainsDuplicate = ContainsDuplicate()

    @Test
    fun test1() {
        /*
        Input: nums = [1,2,3,1]
        Output: true
        */
        val input = intArrayOf(1, 2, 3, 1)
        assertThat(it.containsDuplicate(input))
            .isTrue()
    }

    @Test
    fun test2() {
        /*
        Input: nums = [1,2,3,4]
        Output: false
        */
        val input = intArrayOf(1, 2, 3, 4)
        assertThat(it.containsDuplicate(input))
            .isFalse()
    }

    @Test
    fun test3() {
        /*
        Input: nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true
        */
        val input = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
        assertThat(it.containsDuplicate(input))
            .isTrue()
    }
}