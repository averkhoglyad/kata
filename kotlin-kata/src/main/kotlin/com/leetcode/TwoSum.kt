package com.leetcode

/**
 * ### [Two Sum](https://leetcode.com/problems/two-sum/)
 *
 * Given an array of integers `nums` and an integer `target`, return indices of the two numbers
 * such that they add up to `target`. You may assume that each input would have exactly one solution,
 * and you may not use the same element twice. You can return the answer in any order.
 *
 * ###### Constraints:
 *  - `2 <= nums.length <= 10^4`
 *  - `-10^9 <= nums[i] <= 10^9`
 *  - `-10^9 <= target <= 10^9`
 *  - Only one valid answer exists.
 */
class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val diffs = hashMapOf<Int, Int>()
        for(i in 0..<nums.size) {
            if (diffs[target - nums[i]] != null) {
                return intArrayOf(diffs[target - nums[i]]!!, i)
            } else {
                diffs[nums[i]] = i
            }
        }
        return intArrayOf()
    }
}