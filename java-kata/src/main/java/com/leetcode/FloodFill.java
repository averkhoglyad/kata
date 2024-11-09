package com.leetcode;

import java.util.ArrayDeque;

/**
 * <h3><a href="https://leetcode.com/problems/flood-fill/">Flood Fill</a></h3>
 * <p>
 *     You are given an image represented by an <code>m x n</code> grid of integers <code>image</code>,
 *     where <code>image[i][j]</code> represents the pixel value of the image.
 *     You are also given three integers <code>sr</code>, <code>sc</code>, and <code>color</code>.
 *     Your task is to perform a flood fill on the image starting from the pixel <code>image[sr][sc]</code>.
 * </p>
 * <p>
 *     To perform a flood fill:
 *     <ol>
 *         <li>Begin with the starting pixel and change its color to color.</li>
 *         <li>Perform the same process for each pixel that is directly adjacent (pixels that share a side with the original pixel, either horizontally or vertically) and shares the same color as the starting pixel.</li>
 *         <li>Keep repeating this process by checking neighboring pixels of the updated pixels and modifying their color if it matches the original color of the starting pixel.</li>
 *         <li>The process stops when there are no more adjacent pixels of the original color to update.</li>
 *     </ol>
 * </p>
 * <p>
 *     Return the modified <code>image</code> after performing the flood fill.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>m == image.length</code></li>
 *         <li><code>n == image[i].length</code></li>
 *         <li><code>1 <= m, n <= 50</code></li>
 *         <li><code>0 <= image[i][j], color < 216</code></li>
 *         <li><code>0 <= sr < m</code></li>
 *         <li><code>0 <= sc < n</code></li>
 *     </ul>
 * </p>
 */
public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }

        doFill(image, sr, sc, color, image.length, image[0].length, image[sr][sc]);

        return image;
    }

    private void doFill(int[][] image, int sr, int sc, int color, int maxSr, int maxSc, int originalColor) {
        if (sr < 0 || sr >= maxSr) {
            return;
        }
        if (sc < 0 || sc >= maxSc) {
            return;
        }
        if (image[sr][sc] != originalColor) {
            return;
        }
        image[sr][sc] = color;

        doFill(image, sr - 1, sc, color, maxSr, maxSc, originalColor);
        doFill(image, sr + 1, sc, color, maxSr, maxSc, originalColor);
        doFill(image, sr, sc - 1, color, maxSr, maxSc, originalColor);
        doFill(image, sr, sc + 1, color, maxSr, maxSc, originalColor);
    }

    public int[][] floodFill0(int[][] image, int sr, int sc, int color) {
        final var originalColor = image[sr][sc];
        if (image[sr][sc] == color) {
            return image;
        }

        var queue = new ArrayDeque<int[]>();
        queue.add(new int[]{sr, sc});

        while (!queue.isEmpty()) {
            var point = queue.removeFirst();

            image[point[0]][point[1]] = color;

            if (point[0] - 1 >= 0 && image[point[0] - 1][point[1]] == originalColor) {
                queue.addLast(new int[]{point[0] - 1, point[1]});
            }
            if (point[0] + 1 < image.length && image[point[0] + 1][point[1]] == originalColor) {
                queue.addLast(new int[]{point[0] + 1, point[1]});
            }
            if (point[1] - 1 >= 0 && image[point[0]][point[1] - 1] == originalColor) {
                queue.addLast(new int[]{point[0], point[1] - 1});
            }
            if (point[1] + 1 < image[point[0]].length && image[point[0]][point[1] + 1] == originalColor) {
                queue.addLast(new int[]{point[0], point[1] + 1});
            }
        }

        return image;
    }
}
