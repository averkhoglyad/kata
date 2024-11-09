package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/climbing-stairs/">Climbing Stairs</a></h3>
 * <p>
 *     You are climbing a staircase. It takes <code>n</code> steps to reach the top.
 * </p>
 * <p>
 *     Each time you can either climb <code>1</code> or <code>2</code> steps.
 *     In how many distinct ways can you climb to the top?
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= n <= 45</code></li>
 *     </ul>
 * </p>
 */
public class ClimbingStairs {
    
    private int[] cache = new int[45];
    {
        cache[0] = 1;
        cache[1] = 2;
    }
    public int climbStairs(int n) {
        if (cache[n - 1] > 0) {
            return cache[n - 1];
        }
        cache[n - 1] = climbStairs(n - 1) + climbStairs(n - 2);
        return cache[n - 1];
    }

    public int climbStairs0(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        var first = 1;
        var second = 2;
        for (var i = 3; i < n; i++) {
            var res = first + second;
            first = second;
            second = res;
        }

        return second + first;
    }
}
