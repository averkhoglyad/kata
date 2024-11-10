package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/maximum-subarray/">Maximum Subarray</a></h3>
 * <p>
 *     Given an integer array <code>nums</code>, find the <strong>subarray</strong> with the largest sum, and return <em>its sum</em>.
 * </p>
 * <p>
 *     A subarray is a contiguous non-empty sequence of elements within an array.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= nums.length <= 10^5</code></li>
 *         <li><code>-10^4 <= nums[i] <= 10^4</code></li>
 *     </ul>
 * </p>
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }

            var max = nums[0];
            var sum = Math.max(nums[0], 0);
            for (int i = 1; i < nums.length; i++) {
                sum += nums[i];
                max = Math.max(max, sum);
                sum = Math.max(sum, 0);
            }

            return max;
    }
}
