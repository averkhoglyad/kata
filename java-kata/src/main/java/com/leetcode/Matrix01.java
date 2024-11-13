package com.leetcode;

import java.util.*;

/**
 * <h3><a href="https://leetcode.com/problems/01-matrix/">01 Matrix</a></h3>
 * <p>
 *     Given an <code>m x n</code> binary matrix <code>mat</code>,
 *     return the distance of the nearest <code>0</code> for each cell.
 * </p>
 * <p>
 *     The distance between two adjacent cells is <code>1</code>.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>m == mat.length</code></li>
 *         <li><code>n == mat[i].length</code></li>
 *         <li><code>1 <= m, n <= 10^4</code></li>
 *         <li><code>1 <= m * n <= 10^4</code></li>
 *         <li><code>mat[i][j]</code> is either <code>0</code> or <code>1</code>.</li>
 *         <li>There is at least one <code>0</code> in <code>mat</code>.</li>
 *     </ul>
 * </p>
 */
public class Matrix01 {

    public int[][] updateMatrix(int[][] mat) {
        var xLength = mat.length;
        var yLength = mat[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for (int x = 0; x < xLength; x++) {
            for (int y = 0; y < yLength; y++) {
                mat[x][y] = -mat[x][y];

                if (mat[x][y] == 0) {
                    continue;
                }

                if ((y > 0 && mat[x][y - 1] == 0) ||
                    (y + 1 < yLength && mat[x][y + 1] == 0) ||
                    (x > 0 && mat[x - 1][y] == 0) ||
                    (x + 1 < xLength && mat[x + 1][y] == 0)) {

                    queue.add(new int[]{x, y, 0});
                }

            }
        }

        while (queue.size() > 0) {
            int[] coords = queue.poll();
            var x = coords[0];
            var y = coords[1];

            if (mat[x][y] >= 0) {
                continue;
            }

            var length = coords[2] + 1;

            mat[x][y] = length;

            if (y > 0 && mat[x][y - 1] < 0) queue.add(new int[]{x, y - 1, length});
            if (y + 1 < yLength && mat[x][y + 1] < 0) queue.add(new int[]{x, y + 1, length});
            if (x > 0 && mat[x - 1][y] < 0) queue.add(new int[]{x - 1, y, length});
            if (x + 1 < xLength && mat[x + 1][y] < 0) queue.add(new int[]{x + 1, y, length});
        }

        return mat;
    }

    // bruteforce
    public int[][] updateMatrix0(int[][] mat) {
        for (int[] row : mat) {
            for (int i = 0, rowLength = row.length; i < rowLength; i++) {
                row[i] *= -1;
            }
        }

        var notReady = true;
        while (notReady) {
            notReady = false;
            for (int x = 0, matLength = mat.length; x < matLength; x++) {
                for (int y = 0, rowLength = mat[x].length; y < rowLength; y++) {
                    var nearest = Integer.MAX_VALUE;

                    if (y > 0 && mat[x][y - 1] >= 0) nearest = Math.min(mat[x][y - 1], nearest);
                    if (y + 1 < rowLength && mat[x][y + 1] >= 0) nearest = Math.min(mat[x][y + 1], nearest);
                    if (x > 0 && mat[x - 1][y] >= 0) nearest = Math.min(mat[x - 1][y], nearest);
                    if (x + 1 < matLength && mat[x + 1][y] >= 0) nearest = Math.min(mat[x + 1][y], nearest);

                    if (nearest >= 0 && (mat[x][y] < 0 || nearest < mat[x][y] - 1)) {
                        mat[x][y] = nearest + 1;
                        notReady = true;
                    }
                }
            }
        }

        return mat;
    }
}
