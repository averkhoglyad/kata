package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/squares-of-a-sorted-array/">Squares of a Sorted Array</a></h3>
 *
 * <p>
 *     Given an integer array <code>nums</code> sorted in non-decreasing order,
 *     return an array of <strong>the squares of each number</strong> sorted in non-decreasing order.
 * </p>
 * <p>
 *     <strong>Follow up:</strong> Squaring each element and sorting the new array is very trivial,
 *     could you find an <code>O(n)</code> solution using a different approach?
 * </p>
 *
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= nums.length <= 10^4</code></li>
 *         <li><code>-10^4 <= nums[i] <= 10^4</code></li>
 *     </ul>
 * </p>
 */
public class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {
        var result = new int[nums.length];

        var left = 0;
        var right = nums.length - 1;
        var pos = nums.length - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[pos--] = nums[left] * nums[left];
                left++;
            } else {
                result[pos--] = nums[right] * nums[right];
                right--;
            }
        }

        return result;
    }

    public int[] sortedSquares0(int[] nums) {
        var numsLength = nums.length;
        var result = new int[nums.length];

        var zeroPos = 0;
        while (zeroPos < numsLength && nums[zeroPos] < 0) {
            zeroPos++;
        }

        var left = zeroPos - 1;
        var right = zeroPos;

        for (int i = 0; i < numsLength; i++) {
            int num;
            if (left < 0) {
                num = nums[right++];
            } else if (right >= numsLength) {
                num = nums[left--];
            } else {
                if (-nums[left] < nums[right]) {
                    num = nums[left--];
                } else {
                    num = nums[right++];
                }
            }
            result[i] = num * num;
        }

        return result;
    }
}
