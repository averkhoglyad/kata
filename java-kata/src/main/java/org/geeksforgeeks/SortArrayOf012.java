package org.geeksforgeeks;

/**
 * <h3><a href="https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1">Sort an array of 0s, 1s and 2s</a></h3>
 * <p>
 *     Given an array of size <code>N</code> containing only 0s, 1s, and 2s; sort the array in ascending order.
 * </p>
 * <p>
 *     You don't need to read input or print anything. Your task is to complete the function <code>sort012()</code> that
 *     takes an array arr and N as input parameters and sorts the array in-place.
 * </p>
 *
 * <p>
 *     <strong>Expectations:</strong>
 *     <ul>
 *         <li><strong>Time complexity</strong>: <code>O(N)</code></li>
 *         <li><strong>Auxiliary Space</strong>: <code>O(1)</code></li>
 *     </ul>
 * </p>
 *
 * <p>
 *     <strong>Constraints:</strong>
 *     <ul>
 *         <li><code>1 <= N <= 10^6</code></li>
 *         <li><code>0 <= A[i] <= 2</code></li>
 *     </ul>
 * </p>
 */
public class SortArrayOf012 {

    public void sort012(int[] a, int n)
    {
        int[] nums = new int[3];
        for (int i = 0; i < n; i++) {
            nums[a[i]]++;
        }
        var inc = 0;
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums[j]; i++) {
                a[inc++] = j;
            }
        }
    }

}
