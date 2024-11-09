package com.leetcode

/**
 * ### [Longest Palindrome](https://leetcode.com/problems/longest-palindrome/)
 *
 * Given a string `s` which consists of lowercase or uppercase letters, return the length of
 * the longest [palindrome](https://en.wikipedia.org/wiki/Palindrome) that can be built with those letters.
 *
 * A palindrome is a string that reads the same forward and backward.
 *
 * Letters are case sensitive, for example, `"Aa"` is not considered a palindrome.
 *
 * ###### Constraints:
 *  - `1 <= s.length <= 2000`
 *  - `s` consists of lowercase and/or uppercase English letters only.
 */
class LongestPalindrome {

    fun longestPalindrome(s: String): Int {
        val freqs = IntArray(58)
        s.forEach { freqs[it - 'A']++ }

        var result = 0
        var odd = 0
        for (freq in freqs) {
            if (freq % 2 == 0) {
                result += freq
            } else {
                odd = 1
                result += freq - 1
            }
        }
        return result + odd
    }
}
