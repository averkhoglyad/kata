package com.leetcode

/**
 * ### [First Bad Version](https://leetcode.com/problems/flood-fill/)
 *
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have `n` versions `[1, 2, ..., n]` and you want to find out the first bad one,
 * which causes all the following ones to be bad.
 *
 * You are given an API `bool isBadVersion(version)` which returns whether version is bad.
 * Implement a function to find the first bad `version`.
 * You should minimize the number of calls to the API.
 *
 * ###### Constraints:
 *  - `1 <= bad <= n <= 2^31 - 1`
 */
/*
    The isBadVersion API is defined in the parent class VersionControl.
    boolean isBadVersion(int version);
*/
class FirstBadVersion internal constructor(bad: Int) : VersionControl(bad) {
    fun firstBadVersion(n: Int): Int {
        var min = 1
        var max = n
        while (max >= min) {
            val mid = min + (max - min) / 2
            if (isBadVersion(mid)) {
                max = mid - 1
            } else {
                min = mid + 1
            }
        }
        return min
    }
}

open class VersionControl(private val bad: Int) {

    protected fun isBadVersion(version: Int): Boolean {
        return version >= bad
    }
}
