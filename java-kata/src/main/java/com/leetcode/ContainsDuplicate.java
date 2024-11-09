package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * <h3><a href="https://leetcode.com/problems/contains-duplicate/">Contains Duplicate</a></h3>
 * <p>
 *     Given an integer array <code>nums</code>, return <code>true</code> if any value appears at least twice in the array,
 *     and return <code>false</code> if every element is distinct.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= nums.length <= 10^5</code></li>
 *         <li><code>-10^9 <= nums[i] <= 10^9</code></li>
 *     </ul>
 * </p>
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        var set = new HashSet<Integer>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] == sorted[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
