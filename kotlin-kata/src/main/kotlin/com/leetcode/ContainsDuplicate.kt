package com.leetcode

/**
 * ### [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)
 *
 * Given an integer array `nums`, return `true` if any value appears at least twice in the array,
 * and return `false` if every element is distinct.
 *
 * ###### Constraints:
 *  - `1 <= nums.length <= 10^5`
 *  - `-10^9 <= nums[i] <= 10^9`
 */
class ContainsDuplicate {

    fun containsDuplicate(nums: IntArray): Boolean {
        if (nums.size < 2) {
            return false
        }
        val set = mutableSetOf<Int>()
        nums.forEach {
            if (!set.add(it)) {
                return true
            }
        }
        return false
    }

    fun containsDuplicate0(nums: IntArray): Boolean {
        nums.sort()
        var prev: Int = nums[0]
        for (i in 1..<nums.size) {
            if (nums[i] == prev) {
                return true
            }
            prev = nums[i]
        }
        return false
    }
}
