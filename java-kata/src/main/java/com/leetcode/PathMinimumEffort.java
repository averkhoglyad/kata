package com.leetcode;

import java.util.ArrayDeque;
import java.util.Objects;

/**
 * <h3><a href="https://leetcode.com/problems/path-with-minimum-effort/">Path With Minimum Effort</a></h3>
 *
 * <p>
 *     You are a hiker preparing for an upcoming hike. You are given <code>heights</code>, a 2D array of size
 *     <code>rows x columns</code>, where <code>heights[row][col]</code> represents the height of cell <code>(row, col)</code>.
 *     You are situated in the top-left cell, <wm>(0, 0)</wm>, and you hope to travel to the bottom-right cell,
 *     <code>(rows-1, columns-1)</code> (i.e., <strong>0-indexed</strong>). You can move <strong>up</strong>,
 *     <strong>down</strong>, <strong>left</strong> or <strong>right</strong>, and you wish to find a route
 *     that requires the minimum <strong>effort</strong>.
 * </p>
 *
 * <p>
 *     A route's <strong>effort</strong> is the <strong>maximum absolute difference</strong> in heights
 *     between two consecutive cells of the route.
 * </p>
 * <p>
 *     Return the minimum <strong>effort</strong> required to travel from the top-left cell to the bottom-right cell.
 * </p>
 *
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>rows == heights.length</code></li>
 *         <li><code>columns == heights[i].length</code></li>
 *         <li><code>1 <= rows, columns <= 100</code></li>
 *         <li><code>1 <= heights[i][j] <= 10^6</code></li>
 *     </ul>
 * </p>
 */
public class PathMinimumEffort {

    public int minimumEffortPath(int[][] heights) {
        if (heights.length == 1 && heights[0].length == 1) {
            return 0;
        }
//        int maxSize = Math.max(heights.length, heights[0].length);
//        var visited = new boolean[heights.length][heights[0].length];
        var costs = new int[heights.length][heights[0].length];
        var track = new ArrayDeque<Point>();

        var finish = new Point(heights.length - 1, heights[0].length - 1);
        track.push(new Point(0, 0));
        while(!Objects.equals(track.peek(), finish)) {
            var neighbors = neighbors(track.peek(), heights.length - 1, heights[0].length - 1);
            var minDist = distance(finish, neighbors[0]);

            var next = neighbors[0];
            for (int i = neighbors.length - 1; i > 0; i--) {
                var n = neighbors[i];
                var d = distance(finish, n);
                if (d < minDist) {
                    next = n;
                }
            }

            track.push(next);
        }

        track.forEach(System.out::println);

        return costs[finish.x()][finish.y()];
    }

    Point[] neighbors(Point point, int maxX, int maxY) {
        Point[] neighbors;
        if ((point.x() == 0 && (point.y() == 0 || point.y() == maxY) ||
                (point.x() == maxX && (point.y() == 0 || point.y() == maxY)))) {
            neighbors = new Point[2];
        } else if (point.x() == 0 || point.y() == 0 || point.x() == maxX || point.y() == maxY) {
            neighbors = new Point[3];
        } else {
            neighbors = new Point[4];
        }

        int i = 0;

        if (point.x() > 0) {
            neighbors[i++] = new Point(point.x() - 1, point.y());
        }
        if (point.y() > 0) {
            neighbors[i++] = new Point(point.x(), point.y() - 1);
        }
        if (point.x() < maxX) {
            neighbors[i++] = new Point(point.x() + 1, point.y());
        }
        if (point.y() < maxY) {
            neighbors[i] = new Point(point.x(), point.y() + 1);
        }

        return neighbors;
    }

    private int distance(Point start, Point end) {
        if (Objects.equals(start, end)) {
            return 0;
        }
        return (int) Math.ceil(Math.sqrt(Math.pow(start.x() - end.x(), 2) + Math.pow(start.y() - end.y(), 2)));
    }

    record Point(int x, int y) {
    }

}
