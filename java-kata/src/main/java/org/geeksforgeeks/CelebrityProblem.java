package org.geeksforgeeks;

/**
 * <h3><a href="https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1">The Celebrity Problem</a></h3>
 * <p>
 *     A celebrity is a person who is known to all but does not know anyone at a party.
 *     If you go to a party of N people, find if there is a celebrity in the party or not.
 *     A square NxN matrix M[][] is used to represent people at the party such that
 *     if an element of row <code>i</code> and column <code>j</code> is set to 1
 *     it means ith person knows jth person. Here M[i][i] will always be 0.
 * </p>
 * <p>
 *     You don't need to read input or print anything. 
 *     Complete the function <code>celebrity()</code> which takes the matrix M and its size N as input parameters
 *     and returns the index of the celebrity. If no such celebrity is present, return <code>-1</code>.
 * </p>
 * <p>
 *     <strong>Note:</strongFollow <code>0</code> based indexing.
 * </p>
 * <p>
 *     <strong>Follow Up</strong>: Can you optimize it to <code>O(N)</code>
 * </p>
 * 
 * <p>
 *     <strong>Expectations:</strong>
 *     <ul>
 *         <li><strong>Time complexity</strong>: <code>O(N^2)</code></li>
 *         <li><strong>Auxiliary Space</strong>: <code>O(1)</code></li>
 *     </ul>
 * </p>
 *
 * <p>
 *     <strong>Constraints:</strong>
 *     <ul>
 *         <li><code>2 <= N <= 3000</code></li>
 *         <li><code>0 <= M[][] <= 1</code></li>
 *     </ul>
 * </p>
 */
public class CelebrityProblem {

    int celebrity(int[][] m, int n)
    {
        if (n < 2) {
            throw new IllegalArgumentException();
        }

        var left = 0;
        var right = n-1;
        while (right > left) {
            if (m[left][right] > 0) {
                left++;
            } else {
                right--;
            }
        }

        var candidate = left;
        for (var i = 0; i < n; i++) {
            if (i == candidate) {
                continue;
            }
            if (m[candidate][i] != 0) {
                return -1;
            }
            if (m[i][candidate] == 0) {
                return -1;
            }
        }
        return candidate;
    }

}
