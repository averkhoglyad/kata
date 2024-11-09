package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <h3><a href="https://leetcode.com/problems/majority-element/">Majority Element</a></h3>
 * <p>
 *     Given an array <code>nums</code> of size <code>n</code>, return <i>the majority element</i>
 * </p>
 * <p>
 *     The majority element is the element that appears more than <code>n / 2</code> times.
 *     You may assume that the majority element always exists in the array.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>n == nums.length</code></li>
 *         <li><code>1 <= n <= 5 * 10^4</code></li>
 *         <li><code>-10^9 <= nums[i] <= 10^9</code></li>
 *     </ul>
 * </p>
 * <p>
 *     <strong>Follow-up:</strong>
 *     Could you solve the problem in linear time and in O(1) space?
 * </p>
 */
public class MajorityElement {

    // Boyer-Moore voting algorithm
    public int majorityElement(int[] nums) {
        if (nums.length < 3) {
            return nums[0];
        }

        int count = 1;
        int candidate = nums[0];
        for (var i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            if (candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    // Hoare algorithm
    public int majorityElement2(int[] nums) {
        if (nums.length < 3) {
            return nums[0];
        }
        int k = nums.length / 2;
        int start = 0;
        int end = nums.length - 1;
        int x, temp;
        int i, j;
        while (start < end) {
            x = nums[k];
            i = start;
            j = end;
            do {
                while (nums[i] < x) {
                    i++;
                }
                while (x < nums[j]) {
                    j--;
                }
                if (i <= j) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
            } while (i <= j);
            if (j < k)
                start = i;
            if (k < i)
                end = j;
        }
        return nums[k];
    }

    public int majorityElement1(int[] nums) {
        if (nums.length < 3) {
            return nums[0];
        }
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toMap(Function.identity(), __ -> 1, Integer::sum))
                .entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .get()
                .getKey();
    }

    public int majorityElement0(int[] nums) {
        if (nums.length < 3) {
            return nums[0];
        }
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
