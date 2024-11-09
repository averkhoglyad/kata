package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FloodFillTest {
    private val it: FloodFill = FloodFill()

    @Test
    fun test1() {
//        Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
//        Output: [[2,2,2],[2,2,0],[2,0,1]]
//        Explanation:
//        From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel), all pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels) are colored with the new color.
//        Note the bottom corner is not colored 2, because it is not horizontally or vertically connected to the starting pixel.

        val image = arrayOf<IntArray>(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 1, 0),
            intArrayOf(1, 0, 1)
        )
        val expected = arrayOf<IntArray>(
            intArrayOf(2, 2, 2),
            intArrayOf(2, 2, 0),
            intArrayOf(2, 0, 1)
        )
        val result = it.floodFill(image, 1, 1, 2)

        assertThat(result)
            .isDeepEqualTo(expected)
    }

    @Test
    fun test2() {
//        Input: image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 0
//        Output: [[0,0,0],[0,0,0]]
//        Explanation:
//        The starting pixel is already colored with 0, which is the same as the target color. Therefore, no changes are made to the image.

        val image = arrayOf<IntArray>(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0)
        )
        val expected = arrayOf<IntArray>(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0)
        )
        val result = it.floodFill(image, 0, 0, 0)

        assertThat(result)
            .isDeepEqualTo(expected)
    }
}