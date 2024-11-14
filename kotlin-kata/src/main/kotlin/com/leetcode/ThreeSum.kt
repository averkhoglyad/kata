package com.leetcode

/**
 * ### [3Sum](https://leetcode.com/problems/3sum/)
 *
 * Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]`
 * such that `i != j`, `i != k` and `j != k` and `nums[i] + nums[j] + nums[k] == 0`.
 * Notice that the solution set must not contain duplicate triplets.
 *
 * ###### Constraints:
 *  - `3 <= nums.length <= 3000`
 *  - `-10^5 <= nums[i] <= 10^5`
 */
class ThreeSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        if (nums.size < 3) {
            return emptyList<List<Int>>()
        }

        nums.sort()

        val result = mutableListOf<List<Int>>()

        for (base in 0..nums.size - 3) {
            if (base > 0 && nums[base] == nums[base - 1]) {
                continue;
            }

            var left = base + 1
            var right = nums.size - 1

            while (left < right) {
                val sum = nums[base] + nums[left] + nums[right]
                if (sum == 0) {
                    result.add(listOf(nums[base], nums[left], nums[right]))
                }
                if (sum < 0) {
                    while (++left < right && nums[left] == nums[left - 1]);
                } else {
                    while (left < --right && nums[right] == nums[right + 1]);
                }
            }
        }

        return result
    }
}
