package com.leetcode;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * <h3><a href="https://leetcode.com/problems/sliding-window-maximum/">Sliding Window Maximum</a></h3>
 * <p>
 * You are given an array of integers <code>nums</code>, there is a sliding window of size <code>k</code>
 * which is moving from the very left of the array to the very right.
 * You can only see the <code>k</code> numbers in the window. Each time the sliding window moves right by one position.
 * </p>
 * <p>
 * Return the max sliding window.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= nums.length <= 10^5</code></li>
 *         <li><code>-10^4 <= nums[i] <= 10^4</code></li>
 *         <li><code>1 <= k <= nums.length</code></li>
 *     </ul>
 * </p>
 */
public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        var res = new int[nums.length - k + 1];
        var deq = new ArrayDeque<Integer>();

        var right = 0;
        var pos = 0;

        while (right < nums.length) {
            while (!deq.isEmpty() && nums[deq.getFirst()] < nums[right]) {
                deq.removeFirst();
            }
            deq.addFirst(right);

            right++;
            if (right < k) {
                continue;
            }
            
            res[pos++] = nums[deq.getLast()];

            if (deq.getLast() == right - k) {
                deq.removeLast();
            }
        }

        return res;
    }

    public int[] maxSlidingWindow0(int[] nums, int k) {
        var res = new int[nums.length - k + 1];
        var window = new PriorityQueue<>(Comparator.<Integer>naturalOrder().reversed());

        for (var i = 0; i < k; i++) {
            window.add(nums[i]);
        }

        res[0] = window.peek();

        var pos = 1;
        for (var i = k; i < nums.length; i++) {
            window.remove(nums[i - k]);
            window.add(nums[i]);
            res[pos++] = window.peek();
        }

        return res;
    }
}
