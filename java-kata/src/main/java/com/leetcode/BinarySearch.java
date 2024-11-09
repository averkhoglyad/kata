package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/binary-search/">Binary Search</a></h3>
 * <p>
 *     Given an array of integers <code>nums</code> which is sorted in ascending order, and an integer <code>target</code>,
 *     write a function to search <code>target</code> in <wm>nums</wm>.
 *     If <code>target</code> exists, then return its index. Otherwise, return <code>-1</code>.
 * </p>
 * <p>
 *     You must write an algorithm with <code>O(log n)</code> runtime complexity.
 * </p>
 *
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= nums.length <= 10^4</code></li>
 *         <li><code>-10^4 < nums[i], target < 10^4</code></li>
 *         <li>All the integers in <code>nums</code> are <strong>unique</strong></li>
 *         <li><code>nums</code> is sorted in ascending order</li>
 *     </ul>
 * </p>
 */
public class BinarySearch {

    public int search(int[] nums, int target) {
//        return doSearch(nums, target, 0, nums.length);
        int leftIncluding = 0;
        int rightExcluding = nums.length;
        while (leftIncluding < rightExcluding) {
            var mid = (leftIncluding + rightExcluding) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                rightExcluding = mid;
            } else {
                leftIncluding = mid + 1;
            }
        }
        return -1;
    }

    private int doSearch(int[] nums, int target, int leftIncluding, int rightExcluding) {
        if (leftIncluding >= rightExcluding) {
            return -1;
        }
        var mid = (leftIncluding + rightExcluding) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        return nums[mid] > target ?
                doSearch(nums, target, leftIncluding, mid) :
                doSearch(nums, target, mid + 1, rightExcluding);
    }
}
