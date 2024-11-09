package com.leetcode;

import java.util.concurrent.ThreadLocalRandom;

/**
 * <h3><a href="https://leetcode.com/problems/sort-an-array/">Sort an Array</a></h3>
 * <p>
 * Given an array of integers <code>nums</code>, sort the array in ascending order and return it.
 * You must solve the problem <strong>without using any built-in functions</strong>
 * in <code>O(nlog(n))</code> time complexity and with the smallest space complexity possible.
 * </p>
 *
 * <p>
 * <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= nums.length <= 5 * 10^4</code></li>
 *         <li><code>-5 * 10^4 <= nums[i] <= 5 * 10^4</code></li>
 *     </ul>
 * </p>
 */
public class SortArray {
    public int[] sortArray(int[] nums) {
//        mSort(nums);
        qSort(nums);
        return nums;
    }

    private void mSort(int[] nums) {
        mSort(nums, new int[nums.length], 0, nums.length - 1);
    }

    private void mSort(int[] nums, int[] temp, int start, int end) {
        if (start >= end) {
            return;
        }
        if (end - start == 1) {
            if (nums[start] > nums[end]) {
                swap(nums, start, end);
            }
            return;
        }
        var mid = start + (end - start) / 2;

        mSort(nums, temp, start, mid);
        mSort(nums, temp, mid + 1, end);

        System.arraycopy(nums, start, temp, start, end - start + 1);
        
        var left = start;
        var right = mid + 1;
        var inc = start;
        while (left <= mid && right <= end) {
            if (temp[left] < temp[right]) {
                nums[inc++] = temp[left++];
            } else {
                nums[inc++] = temp[right++];
            }
        }
        while (left <= mid) {
            nums[inc++] = temp[left++];
        }
        while (right <= end) {
            nums[inc++] = temp[right++];
        }
    }

    private void qSort(int[] nums) {
        qSort(nums, 0, nums.length - 1);
    }

    private void qSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        if (end - start == 1) {
            if (nums[start] > nums[end]) {
                swap(nums, start, end);
            }
            return;
        }

        var base = nums[ThreadLocalRandom.current().nextInt(start, end)];

        int left = start, right = end;
        while (left < right) {
            while (nums[left] < base) {
                left++;
            }

            while (nums[right] > base) {
                right--;
            }

            if (left < right) {
                swap(nums, left, right);
                left++;
                right--;
            }
        }

        qSort(nums, start, right);
        qSort(nums, left, end);
    }

    private void swap(int[] nums, int left, int right) {
        var tmp = nums[right];
        nums[right] = nums[left];
        nums[left] = tmp;
    }
}
