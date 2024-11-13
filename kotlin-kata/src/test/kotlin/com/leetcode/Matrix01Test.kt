package com.leetcode

import org.assertj.core.api.Assertions.assertThat

internal class Matrix01Test {
    private val target = Matrix01()

    @org.junit.jupiter.api.Test
    fun test1() {
//        Input: mat = [[0,0,0],[0,1,0],[0,0,0]]
//        Output: [[0,0,0],[0,1,0],[0,0,0]]

        val input = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0))
        val expected = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0))

        assertThat(target.updateMatrix(input))
            .isDeepEqualTo(expected)
    }

    @org.junit.jupiter.api.Test
    fun test2() {
//        Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
//        Output: [[0,0,0],[0,1,0],[1,2,1]]

        val input = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 1, 1))
        val expected = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 2, 1))

        assertThat(target.updateMatrix(input))
            .isDeepEqualTo(expected)
    }

    @org.junit.jupiter.api.Test
    fun test3() {
//        Input: mat = [[1,1,0,0,1,0,0,1,1,0],
//                      [1,0,0,1,0,1,1,1,1,1],
//                      [1,1,1,0,0,1,1,1,1,0],
//                      [0,1,1,1,0,1,1,1,1,1],
//                      [0,0,1,1,1,1,1,1,1,0],
//                      [1,1,1,1,1,1,0,1,1,1],
//                      [0,1,1,1,1,1,1,0,0,1],
//                      [1,1,1,1,1,0,0,1,1,1],
//                      [0,1,0,1,1,0,1,1,1,1],
//                      [1,1,1,0,1,0,1,1,1,1]]

//        Output:      [[2,1,0,0,1,0,0,1,1,0],
//                      [1,0,0,1,0,1,1,2,2,1],
//                      [1,1,1,0,0,1,2,2,1,0],
//                      [0,1,2,1,0,1,2,3,2,1],
//                      [0,0,1,2,1,2,1,2,1,0],
//                      [1,1,2,3,2,1,0,1,1,1],
//                      [0,1,2,3,2,1,1,0,0,1],
//                      [1,2,1,2,1,0,0,1,1,2],
//                      [0,1,0,1,1,0,1,2,2,3],
//                      [1,2,1,0,1,0,1,2,3,4]]

        val input = arrayOf(
            intArrayOf(1, 1, 0, 0, 1, 0, 0, 1, 1, 0),
            intArrayOf(1, 0, 0, 1, 0, 1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 0, 0, 1, 1, 1, 1, 0),
            intArrayOf(0, 1, 1, 1, 0, 1, 1, 1, 1, 1),
            intArrayOf(0, 0, 1, 1, 1, 1, 1, 1, 1, 0),
            intArrayOf(1, 1, 1, 1, 1, 1, 0, 1, 1, 1),
            intArrayOf(0, 1, 1, 1, 1, 1, 1, 0, 0, 1),
            intArrayOf(1, 1, 1, 1, 1, 0, 0, 1, 1, 1),
            intArrayOf(0, 1, 0, 1, 1, 0, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 0, 1, 0, 1, 1, 1, 1)
        )
        val expected = arrayOf(
            intArrayOf(2, 1, 0, 0, 1, 0, 0, 1, 1, 0),
            intArrayOf(1, 0, 0, 1, 0, 1, 1, 2, 2, 1),
            intArrayOf(1, 1, 1, 0, 0, 1, 2, 2, 1, 0),
            intArrayOf(0, 1, 2, 1, 0, 1, 2, 3, 2, 1),
            intArrayOf(0, 0, 1, 2, 1, 2, 1, 2, 1, 0),
            intArrayOf(1, 1, 2, 3, 2, 1, 0, 1, 1, 1),
            intArrayOf(0, 1, 2, 3, 2, 1, 1, 0, 0, 1),
            intArrayOf(1, 2, 1, 2, 1, 0, 0, 1, 1, 2),
            intArrayOf(0, 1, 0, 1, 1, 0, 1, 2, 2, 3),
            intArrayOf(1, 2, 1, 0, 1, 0, 1, 2, 3, 4)
        )

        assertThat(target.updateMatrix(input))
            .isDeepEqualTo(expected)
    }

    @org.junit.jupiter.api.Test
    fun test4() {
//        Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
//        Output: [[0,0,0],[0,1,0],[1,2,1]]

        val input = arrayOf(intArrayOf(0))
        val expected = arrayOf(intArrayOf(0))

        assertThat(target.updateMatrix(input))
            .isDeepEqualTo(expected)
    }
}