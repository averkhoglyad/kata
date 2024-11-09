package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/sort-colors/">Sort Colors</a></h3>
 *
 * <p>
 *     Given an array <code>nums</code> with <code>n</code> objects colored red, white, or blue,
 *     sort them in-place so that objects of the same color are adjacent, with the colors
 *     in the order red, white, and blue. We will use the integers <code>0</code>, <code>1</code>, and <code>2</code>
 *     to represent the color red, white and blue, respectively.
 *     You must solve this problem without using the library's sort function.
 * </p>
 *
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>n == nums.length</code></li>
 *         <li><code>1 <= n <= 300</code></li>
 *         <li><code>nums[i]</code> is either <code>0</code>, <code>1</code> or <code>2</code></li>
 *     </ul>
 * </p>
 */
public class SortColors {
    public void sortColors(int[] nums) {
        var count0 = 0;
        var count1 = 0;

        for (int num : nums) {
            if (num == 0) {
                count0++;
            }
            if (num == 1) {
                count1++;
            }
        }

        for (var i = 0; i < count0; i++) {
            nums[i] = 0;
        }

        count1 += count0;
        for (var i = count0; i < count1; i++) {
            nums[i] = 1;
        }

        for (var i = count1; i < nums.length; i++) {
            nums[i] = 2;
        }
    }
}
