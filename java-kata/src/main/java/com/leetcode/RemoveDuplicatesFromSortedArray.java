package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">Remove Duplicates from Sorted Array</a></h3>
 * <p>
 *     Given an integer array <code>nums</code> sorted in non-decreasing order,
 *     remove the duplicates <strong>in-place</strong> such that each unique element appears only once.
 *     The relative order of the elements should be kept the same.
 *     Then return the number of unique elements in <code>nums</code>.
 * </p>
 * <p>
 *     Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 *     <ul>
 *         <li>
 *             Change the array <code>nums</code> such that the first <code>k</code> elements of <code>nums</code>
 *             contain the unique elements in the order they were present in <code>nums</code> initially.
 *             The remaining elements of <code>nums</code> are not important as well as the size of <code>nums</code>
 *         </li>
 *         <li>
 *             Return <code>k</code>
 *         </li>
 *     </ul>
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= nums.length <= 3 * 10^4</code></li>
 *         <li><code>-100 <= nums[i] <= 100</code></li>
 *         <li><code>nums</code> is sorted in non-decreasing order</li>
 *     </ul>
 * </p>
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int prev = 0;
        for (var i = 1; i < nums.length; i++) {
            if (nums[i] != nums[prev]) {
                nums[++prev] = nums[i];
            }
        }
        return prev + 1;
    }

}
