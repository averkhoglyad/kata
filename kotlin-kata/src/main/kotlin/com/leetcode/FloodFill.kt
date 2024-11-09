package com.leetcode

/**
 * ### [Flood Fill](https://leetcode.com/problems/flood-fill/)
 *
 * You are given an image represented by an `m x n` grid of integers `image`,
 * where `image[i][j]` represents the pixel value of the image.
 * You are also given three integers `sr`, `sc`, and `color`.
 * Your task is to perform a flood fill on the image starting from the pixel `image[sr][sc]`.
 *
 * To perform a flood fill:
 *  1. Begin with the starting pixel and change its color to color.
 *  1. Perform the same process for each pixel that is directly adjacent (pixels that share a side with the original pixel, either horizontally or vertically) and shares the same color as the starting pixel.
 *  1. Keep repeating this process by checking neighboring pixels of the updated pixels and modifying their color if it matches the original color of the starting pixel.
 *  1. The process stops when there are no more adjacent pixels of the original color to update.
 *
 * Return the modified `image` after performing the flood fill.
 *
 * ###### Constraints:
 *  - `m == image.length`
 *  - `n == image[i].length`
 *  - `1 <= m, n <= 50`
 *  - `0 <= image[i][j], color < 216`
 *  - `0 <= sr < m`
 *  - `0 <= sc < n`
 */
class FloodFill {

    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        if (image[sr][sc] == color) {
            return image
        }
        doFill(image, sr, sc, color, image.size, image[0].size, image[sr][sc])
        return image
    }

    private fun doFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int, maxSr: Int, maxSc: Int, oldColor: Int) {
        if (sr < 0 || sr >= maxSr) {
            return
        }
        if (sc < 0 || sc >= maxSc) {
            return
        }
        if (image[sr][sc] != oldColor) {
            return
        }

        image[sr][sc] = color

        doFill(image, sr - 1, sc, color, maxSr, maxSc, oldColor)
        doFill(image, sr + 1, sc, color, maxSr, maxSc, oldColor)
        doFill(image, sr, sc - 1, color, maxSr, maxSc, oldColor)
        doFill(image, sr, sc + 1, color, maxSr, maxSc, oldColor)
    }

    fun floodFill0(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        if (image[sr][sc] == color) {
            return image
        }

        val originalColor = image[sr][sc]

        val queue = ArrayDeque<IntArray>()
        queue.addLast(intArrayOf(sr, sc))

        while (queue.isNotEmpty()) {
            var point = queue.removeFirst()

            image[point[0]][point[1]] = color

            if (point[0] > 0 && image[point[0] - 1][point[1]] == originalColor) {
                queue.addLast(intArrayOf(point[0] - 1, point[1]))
            }
            if (point[0] < image.size - 1 && image[point[0] + 1][point[1]] == originalColor) {
                queue.addLast(intArrayOf(point[0] + 1, point[1]))
            }
            if (point[1] > 0 && image[point[0]][point[1] - 1] == originalColor) {
                queue.addLast(intArrayOf(point[0], point[1] - 1))
            }
            if (point[1] < image[point[0]].size - 1 && image[point[0]][point[1] + 1] == originalColor) {
                queue.addLast(intArrayOf(point[0], point[1] + 1))
            }
        }

        return image
    }
}
