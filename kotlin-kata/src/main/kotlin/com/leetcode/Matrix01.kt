package com.leetcode

import java.util.LinkedList

/**
 * ### [01 Matrix](https://leetcode.com/problems/01-matrix/)
 *
 * Given an `m x n` binary matrix `mat`,
 * return the distance of the nearest `0` for each cell.
 *
 * The distance between two adjacent cells is `1`.
 *
 * ###### Constraints:
 *  - `m == mat.length`
 *  - `n == mat[i].length`
 *  - `1 <= m, n <= 10^4`
 *  - `1 <= m * n <= 10^4`
 *  - `mat[i][j]` is either `0` or `1`.
 *  - There is at least one `0` in `mat`.
 */
class Matrix01 {

    fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
        val xSize = mat.size
        val ySize = mat[0].size

        val queue = LinkedList<Triple<Int, Int, Int>>()
        for (x in 0..<xSize) {
            for (y in 0..<ySize) {
                if (mat[x][y] == 0) {
                    continue
                }
                mat[x][y] = -1
                when {
                    x > 0 && mat[x - 1][y] == 0 -> queue.add(Triple(x, y, 1))
                    x < xSize - 1 && mat[x + 1][y] == 0 -> queue.add(Triple(x, y, 1))
                    y > 0 && mat[x][y - 1] == 0 -> queue.add(Triple(x, y, 1))
                    y < ySize - 1 && mat[x][y + 1] == 0 -> queue.add(Triple(x, y, 1))
                }
            }
        }

        while (queue.isNotEmpty()) {
            val (x, y, length) = queue.removeFirst()
            if (mat[x][y] >= 0) {
                continue
            }
            mat[x][y] = length

            val nextLength = length + 1
            if (x > 0 && mat[x - 1][y] < 0) queue.add(Triple(x - 1, y, nextLength))
            if (x < xSize - 1 && mat[x + 1][y] < 0) queue.add(Triple(x + 1, y, nextLength))
            if (y > 0 && mat[x][y - 1] < 0) queue.add(Triple(x, y - 1, nextLength))
            if (y < ySize - 1 && mat[x][y + 1] < 0) queue.add(Triple(x, y + 1, nextLength))
        }

        return mat
    }
}
