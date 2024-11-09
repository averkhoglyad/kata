package com.leetcode;

import java.util.HashMap;

/**
 * <h3><a href="https://leetcode.com/problems/two-sum/">Two Sum</a></h3>
 *
 * <p>
 * Given an array of integers <code>nums</code> and an integer <code>target</code>, return indices of the two numbers
 * such that they add up to <code>target</code>. You may assume that each input would have exactly one solution,
 * and you may not use the same element twice. You can return the answer in any order.
 * </p>
 * <p>
 * <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>2 <= nums.length <= 10^4</code></li>
 *         <li><code>-10^9 <= nums[i] <= 10^9</code></li>
 *         <li><code>-10^9 <= target <= 10^9</code></li>
 *         <li>Only one valid answer exists.</li>
 *     </ul>
 * </p>
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        map.put(nums[0], 0);
        for (int i = 1, numsLength = nums.length; i < numsLength; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
