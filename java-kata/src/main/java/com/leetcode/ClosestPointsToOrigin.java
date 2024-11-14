package com.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Stream;

/**
 * <h3><a href="https://leetcode.com/problems/k-closest-points-to-origin">K Closest Points to Origin</a></h3>
 * <p>
 *     Given an array of <code>points</code> where <code>points[i] = [xi, yi]</code>
 *     represents a point on the <strong>X-Y</strong> plane and an integer <code>k</code>,
 *     return the <code>k</code> closest points to the origin <code>(0, 0)</code>.
 * </p>
 * <p>
 *     The distance between two points on the <strong>X-Y</strong> plane is the Euclidean distance
 *     (i.e., <code>√((x1 - x2)^2 + (y1 - y2)^2)</code>).
 * </p>
 * <p>
 *     You may return the answer in <code>any order</code>. The answer is <code>guaranteed</code> to be unique
 *     (except for the order that it is in).
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= k <= points.length <= 10^4</code></li>
 *         <li><code>-10^4 <= xi, yi <= 10^4</code></li>
 *     </ul>
 * </p>
 */
public class ClosestPointsToOrigin {

    public int[][] kClosest(int[][] points, int k) {
        return Stream.of(points)
                .sorted(Comparator.comparingInt(it -> it[0] * it[0] + it[1] * it[1]))
                .limit(k)
                .toArray(int[][]::new);
    }


    public int[][] kClosest0(int[][] points, int k) {
        var priorityQueue = new PriorityQueue<int[]>(Comparator.<int[]>comparingInt(it -> it[0] * it[0] + it[1] * it[1]).reversed());

        for (int[] point : points) {
            priorityQueue.add(point);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }

        return priorityQueue.toArray(new int[0][]);
    }
}
