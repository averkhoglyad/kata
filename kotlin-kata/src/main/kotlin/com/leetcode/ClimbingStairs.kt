package com.leetcode

/**
 * ### [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)
 *
 * You are climbing a staircase. It takes `n` steps to reach the top.
 *
 * Each time you can either climb `1` or `2` steps.
 * In how many distinct ways can you climb to the top?
 *
 * ###### Constraints:
 *  - `1 <= n <= 45`
 */
class ClimbingStairs {

    private val cache = IntArray(45).also {
        it[0] = 1
        it[1] = 2
    }

    fun climbStairs0(n: Int): Int {
        if (cache[n - 1] > 0) {
            return cache[n - 1]
        }
        cache[n - 1] = climbStairs(n - 1) + climbStairs(n - 2)
        return cache[n - 1]
    }

    fun climbStairs(n: Int): Int {
        if (n == 1) {
            return 1
        }
        if (n == 2) {
            return 2
        }

        var first = 1
        var second = 2
        repeat(n - 3) {
            val res = first + second
            first = second
            second = res
        }

        return first + second
    }
}
