package com.leetcode

import java.util.Arrays
import java.util.Comparator
import java.util.Map
import java.util.function.BinaryOperator
import java.util.function.Function
import java.util.function.ToIntFunction
import java.util.stream.Collectors

/**
 * ### [Majority Element](https://leetcode.com/problems/majority-element/)
 *
 * Given an array `nums` of size `n`, return *the majority element*
 *
 * The majority element is the element that appears more than `n / 2` times.
 * You may assume that the majority element always exists in the array.
 *
 * ###### Constraints:
 *  - `n == nums.length`
 *  - `1 <= n <= 5 * 10^4`
 *  - `-10^9 <= nums[i] <= 10^9`
 *
 * **Follow-up:** Could you solve the problem in linear time and in O(1) space?
 */
class MajorityElement {

    // Boyer-Moore voting algorithm
    fun majorityElement(nums: IntArray): Int {
        if (nums.size < 3) {
            return nums[0]
        }
        var candidate = nums[0]
        var count = 1
        for (i in 1..<nums.size) {
            if (count == 0) {
                candidate = nums[i]
            }
            if (nums[i] == candidate) {
                count++
            } else {
                count--
            }
        }
        return candidate
    }

    // Sorting based
    fun majorityElement0(nums: IntArray): Int {
        if (nums.size < 3) {
            return nums[0]
        }
        nums.sort()
        return nums[nums.size / 2]
    }
}
