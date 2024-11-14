package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClosestPointsToOriginTest {
    private val target = ClosestPointsToOrigin()

    @Test
    fun test1() {
//        Input: points = [[1,3],[-2,2]], k = 1
//        Output: [[-2,2]]
//        Explanation:
//        The distance between (1, 3) and the origin is sqrt(10).
//        The distance between (-2, 2) and the origin is sqrt(8).
//        Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
//        We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].

        val points = arrayOf(intArrayOf(1, 3), intArrayOf(-2, 2))
        val expected = arrayOf(intArrayOf(-2, 2))

        assertThat(target.kClosest(points, 1))
            .isDeepEqualTo(expected)
    }

    @Test
    fun test2() {
//        Input: points = [[3,3],[5,-1],[-2,4]], k = 2
//        Output: [[3,3],[-2,4]]
//        Explanation: The answer [[-2,4],[3,3]] would also be accepted.

        val points = arrayOf(intArrayOf(3, 3), intArrayOf(5, -1), intArrayOf(-2, 4))
        val expected = arrayOf(intArrayOf(3, 3), intArrayOf(-2, 4))

        assertThat(target.kClosest(points, 2))
            .isDeepEqualTo(expected)
    }
}