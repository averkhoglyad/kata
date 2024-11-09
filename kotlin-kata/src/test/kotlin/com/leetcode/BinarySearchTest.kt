package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BinarySearchTest {
    var it: BinarySearch = BinarySearch()

    @Test
    fun test0() {
//        Input: nums = [-1,0,3,5,9,12], target = 9
//        Output: 4
//        Explanation: 9 exists in nums and its index is 4
        assertThat(it.search(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
            .isEqualTo(4)
    }

    @Test
    fun test1() {
//        Input: nums = [-1,0,3,5,9,12], target = 2
//        Output: -1
//        Explanation: 2 does not exist in nums so return -1
        assertThat(it.search(intArrayOf(-1, 0, 3, 5, 9, 12), 2))
            .isEqualTo(-1)
    }

    @Test
    fun test2() {
        assertThat(it.search(intArrayOf(-1, 0, 3, 5, 9, 12), -1))
            .isEqualTo(0)
    }

    @Test
    fun test3() {
        assertThat(it.search(intArrayOf(-1, 0, 3, 5, 9, 12), 12))
            .isEqualTo(5)
    }

    @Test
    fun test4() {
        assertThat(it.search(intArrayOf(-1, 0, 3, 5, 9, 12), 13))
            .isEqualTo(-1)
    }
}