package com.leetcode

/**
 * ### [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)
 *
 * A phrase is a **palindrome** if, after converting all uppercase letters into lowercase letters and
 * removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 *
 * Given a string `s`, return `true` if it is a palindrome, or `false` otherwise.
 *
 * ###### Constraints:
 *  - `1 <= s.length <= 2 * 10^5`
 *  - `s` consists only of printable ASCII characters.
 */
class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        while (left < right) {
            var leftCh = s[left]
            while (!leftCh.isLetterOrDigit() && ++left <= right) {
                leftCh = s[left]
            }

            var rightCh = s[right]
            while (!rightCh.isLetterOrDigit() && left <= --right) {
                rightCh = s[right]
            }

            if (!leftCh.equals(rightCh, ignoreCase = true)) {
                return false
            }

            left++
            right--
        }

        return true
    }
}
