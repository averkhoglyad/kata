package com.leetcode

import java.util.PriorityQueue

/**
 * ### [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin)
 *
 * Given an array of `points` where `points[i] = [xi, yi]`
 * represents a point on the **X-Y** plane and an integer `k`,
 * return the `k` closest points to the origin `(0, 0)`.
 *
 * The distance between two points on the **X-Y** plane is the Euclidean distance
 * (i.e., `√((x1 - x2)^2 + (y1 - y2)^2)`).
 *
 * You may return the answer in `any order`. The answer is `guaranteed` to be unique
 * (except for the order that it is in).
 *
 * ###### Constraints:
 *  - `1 <= k <= points.length <= 10^4`
 *  - `-10^4 <= xi, yi <= 10^4`
 */
class ClosestPointsToOrigin {

    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
        var queue = PriorityQueue<IntArray>(compareBy<IntArray> { it[0] * it[0] + it[1] * it[1] }.reversed())
        for (point in points) {
            queue.add(point)
            if (queue.size > k) {
                queue.poll()
            }
        }
        return queue.toTypedArray()
    }

    fun kClosest0(points: Array<IntArray>, k: Int): Array<IntArray> {
        return points.asSequence()
            .sortedBy { it[0] * it[0] + it[1] * it[1] }
            .take(k)
            .iterator()
            .let { iter -> Array(k) { iter.next() } }
    }
}
