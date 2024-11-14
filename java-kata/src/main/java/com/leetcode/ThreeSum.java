package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * <h3><a href="https://leetcode.com/problems/3sum/">3Sum</a></h3>
 * <p>
 *     Given an integer array nums, return all the triplets <code>[nums[i], nums[j], nums[k]]</code>
 *     such that <code>i != j</code>, <code>i != k</code> and <code>j != k</code> and <code>nums[i] + nums[j] + nums[k] == 0</code>.
 *     Notice that the solution set must not contain duplicate triplets.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>3 <= nums.length <= 3000</code></li>
 *         <li><code>-10^5 <= nums[i] <= 10^5</code></li>
 *     </ul>
 * </p>
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        var result = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        for (int i = 0, numsLength = nums.length - 2; i < numsLength; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            var low = i + 1;
            var high = nums.length - 1;
            do {
                var sum = nums[i] + nums[low] + nums[high];
                if (sum == 0) {
                    result.add(List.of(nums[i], nums[low], nums[high]));
                }
                if (sum > 0) {
                    while(low < --high && nums[high] == nums[high + 1]);
                } else  {
                    while(++low < high && nums[low] == nums[low - 1]);
                }
            } while (high > low);
        }
        return result;
    }
}
