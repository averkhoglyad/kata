package com.leetcode

/**
 * ### [Valid Anagram](https://leetcode.com/problems/valid-anagram/)
 *
 * Given two strings `s` and `t`, return `true` if `t` is an [anagram](https://en.wikipedia.org/wiki/Anagram) of `s`,
 * and `false` otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * using all the original letters exactly once.
 *
 * ###### Constraints:
 *  - `1 <= s.length, t.length <= 5 * 10^4`
 *  - `s` and `t` consist of lowercase English letters.
 */
class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val frequencies = IntArray(26)

        for (i in s.indices) {
            frequencies[s[i] - 'a']++
            frequencies[t[i] - 'a']--
        }

        return frequencies.all { it == 0 }
    }
}
