package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * <h3><a href="https://leetcode.com/problems/contains-duplicate-ii/">Contains Duplicate II</a></h3>
 * <p>
 *     Given an integer array <code>nums</code> and an integer <code>k</code>, return <code>true</code>
 *     if there are two <strong>distinct indices</strong> <code>i</code> and <code>j</code> in the array
 *     such that <code>nums[i] == nums[j]</code> and <code>abs(i - j) <= k</code>.
 * </p>
 * <p>
 * <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= nums.length <= 10^5</code></li>
 *         <li><code>-10^9 <= nums[i] <= 10^9</code></li>
 *         <li><code>k <= 10^5</code></li>
 *     </ul>
 * </p>
 */
public class ContainsDuplicate2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        var exists = new HashSet<Integer>();
        for (var i = 0; i < nums.length; i++) {
            if (!exists.add(nums[i])) {
                return true;
            }
            if (i >= k) {
                exists.remove(nums[i - k]);
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate0(int[] nums, int k) {
        var exists = new HashMap<Integer, Integer>();
        for (var i = 0; i < nums.length; i++) {
            if (exists.containsKey(nums[i]) && i - exists.get(nums[i]) <= k) {
                return true;
            }
            exists.put(nums[i], i);
        }
        return false;
    }
}
