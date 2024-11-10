package com.leetcode

import kotlin.math.max

/**
 * ### [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)
 *
 * Given an integer array `nums`, find the **subarray** with the largest sum, and return *its sum*.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * ###### Constraints:
 *  - `1 <= nums.length <= 10^5`
 *  - `-10^4 <= nums[i] <= 10^4`
 */
class MaximumSubarray {
    fun maxSubArray(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }

        var max = Integer.MIN_VALUE
        var sum = 0
        for (num in nums) {
            sum += num
            max = max(max, sum)
            sum = max(sum, 0)
        }

        return max
    }
}
