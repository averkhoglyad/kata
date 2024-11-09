package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/container-with-most-water/">Container With Most Water</a></h3>
 * <p>
 *     You are given an integer array <code>height</code> of length <code>n</code>. There are <code>n</code> vertical lines drawn
 *     such that the two endpoints of the <code>i-th</code> line are <code>(i, 0)</code> and <code>(i, height[i])</code>.
 *     Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * </p>
 * <p>
 *     Return the maximum amount of water a container can store.
 * </p>
 * <p>
 *     <strong>Notice:</strong> You may not slant the container.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>n == height.length</code></li>
 *         <li><code>2 <= n <= 10^5</code></li>
 *         <li><code>0 <= height[i] <= 10^4</code></li>
 *     </ul>
 * </p>
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        if (height.length == 2) {
            return Math.min(height[0], height[1]);
        }

        var left = 0;
        var right = height.length - 1;
        int volume = 0;

        do {
            var current = (right - left) * Math.min(height[left], height[right]);
            if (current > volume) {
                volume = current;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        } while (left < right);

        return volume;
    }
}
