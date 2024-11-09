package com.leetcode;

import java.util.Arrays;

/**
 * <h3><a href="https://leetcode.com/problems/3sum-closest/description/">3Sum Closest</a></h3>
 * <p>
 *     Given an integer array nums of length n and an integer target,
 *     find three integers in nums such that the sum is closest to target.
 *     Return the sum of the three integers.
 *     You may assume that each input would have exactly one solution.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>3 <= nums.length <= 500</code></li>
 *         <li><code>-1000 <= nums[i] <= 1000</code></li>
 *         <li><code>-10^4 <= target <= 10^4</code></li>
 *     </ul>
 * </p>
 */
public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }

        Arrays.sort(nums);
        var closestDiff = target - (nums[0] + nums[1] + nums[nums.length - 1]);
        for (int i = 0; i < nums.length - 2; i++) {
            var low = i + 1;
            var high = nums.length - 1;
            do {
                var diff = target - (nums[i] + nums[low] + nums[high]);
                if (diff == 0) {
                    return target;
                }
                if (Math.abs(diff) < Math.abs(closestDiff)) {
                    closestDiff = diff;
                }
                if (diff < 0) {
                    high--;
                }
                if (diff > 0) {
                    low++;
                }
            } while (low < high);
        }

        return target - closestDiff;
    }

}
