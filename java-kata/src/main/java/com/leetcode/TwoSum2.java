package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/">Two Sum II - Input Array Is Sorted</a></h3>
 *
 * <p>
 *     Given a <strong>1-indexed array</strong> of integers <code>numbers</code> that is already
 *     <em>sorted in non-decreasing order</em>, find two numbers such that
 *     they add up to a specific <code>target</code> number. Let these two numbers be <code>numbers[index1]</code>
 *     and <code>numbers[index2]</code> where <code>1 <= index1 < index2 <= numbers.length</code>.
 * </p>
 * <p>
 *     Return the indices of the two numbers, <code>index1</code> and <code>index2</code>,
 *     added by one as an integer array <code>[index1, index2]</code> of length 2.
 * </p>
 * <p>
 *     The tests are generated such that there is <strong>exactly one solution</strong>.
 *     You <strong>may not</strong> use the same element twice.
 * </p>
 * <p>
 *     Your solution must use only constant extra space.
 * </p>
 *
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>2 <= numbers.length <= 3 * 10^4</code></li>
 *         <li><code>-1000 <= numbers[i] <= 1000</code></li>
 *         <li><code>numbers</code> is sorted in non-decreasing order</li>
 *         <li><code>-1000 <= target <= 1000</code></li>
 *     </ul>
 * </p>
 */
public class TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 2) {
            return new int[]{1, 2};
        }
        var left = 0;
        var right = numbers.length - 1;

        while (left < right) {
            var diff = target - (numbers[left] + numbers[right]);
            if (diff == 0) {
                return new int[]{left + 1, right + 1};
            }
            if (diff > 0) {
                left++;
            } else {
                right--;
            }
        }

        return new int[0];
    }
}
