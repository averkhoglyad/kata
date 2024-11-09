package com.leetcode

/**
 * ### [Binary Search](https://leetcode.com/problems/binary-search/)
 *
 * Given an array of integers `nums` which is sorted in ascending order, and an integer `target`,
 * write a function to search `target` in <wm>nums</wm>.
 * If `target` exists, then return its index. Otherwise, return `-1`.
 *
 * You must write an algorithm with `O(log n)` runtime complexity.
 *
 * ###### Constraints:
 *  - `1 <= nums.length <= 10^4`
 *  - `-10^4 < nums[i], target < 10^4`
 *  - All the integers in `nums` are **unique**
 *  - `nums` is sorted in ascending order
 */
class BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size
        while (left < right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == target) {
                return mid
            }
            if (nums[mid] > target) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return -1
    }
}
