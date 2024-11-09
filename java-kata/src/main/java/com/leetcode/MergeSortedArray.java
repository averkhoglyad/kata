package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/merge-sorted-array/">Merge Sorted Array</a></h3>
 * <p>
 *     You are given two integer arrays <code>nums1</code> and <code>nums2</code>, sorted in non-decreasing order, and
 *     two integers <code>m</code> and <code>n</code>, representing the number of elements in <code>nums1</code> and <code>nums2</code>
 *     respectively. <strong>Merge</strong> <code>nums1</code> and <code>nums2</code> into a single array sorted in
 *     <strong>non-decreasing order</strong>.
 * </p>
 * <p>
 *     The final sorted array should not be returned by the function,
 *     but instead be stored inside the array <code>nums1</code>.
 *     To accommodate this, <code>nums1</code> has a length of <code>m + n</code>,
 *     where the first <code>m</code> elements denote the elements that should be merged,
 *     and the last <code>n</code> elements are set to <code>0</code> and should be ignored.
 *     <code>nums2</code> has a length of <code>n</code>.
 * </p>
 *
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>nums1.length == m + n</code></li>
 *         <li><code>nums2.length == n</code></li>
 *         <li><code>0 <= m, n <= 200</code></li>
 *         <li><code>1 <= m + n <= 200</code></li>
 *         <li><code>-10^9 <= nums1[i], nums2[j] <= 10^9</code></li>
 *     </ul>
 * </p>
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }

        var swapped = 0;
        for (int j = 0; j < m; j++) {
            var i = swapped;
            while (i < n && nums2[i] < nums1[j + swapped]) {
                i++;
            }
            if (i > swapped) {
                var portionSize = i - swapped;
                System.arraycopy(nums1, j + swapped, nums1, j + swapped + portionSize, m - j);
                System.arraycopy(nums2, swapped, nums1, j + swapped, portionSize);
                swapped = i;
            }
        }
        if (swapped < n) {
            System.arraycopy(nums2, swapped, nums1, m + swapped, n - swapped);
        }
    }

    public void merge0(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }

        out: for (int i = 0, nums2Length = nums2.length; i < nums2Length; i++) {
            for (int j = 0, nums1Length = m + i; j < nums1Length; j++) {
                if (nums1[j] <= nums2[i]) {
                    continue;
                }
                System.arraycopy(nums1, j, nums1, j + 1, nums1Length - j);
                nums1[j] = nums2[i];
                continue out;
            }
            System.arraycopy(nums2, i, nums1, m + i, n - i);
            break;
        }
    }
}
