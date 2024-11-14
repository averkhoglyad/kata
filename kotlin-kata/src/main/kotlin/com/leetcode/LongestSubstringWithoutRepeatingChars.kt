package com.leetcode

import java.util.BitSet
import kotlin.math.max

/**
 * ### [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
 *
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * ###### Constraints:
 *  - `0 <= s.length <= 5 * 10^4`
 *  - `s` consists of English letters, digits, symbols and spaces.
 */
class LongestSubstringWithoutRepeatingChars {

    fun lengthOfLongestSubstring(s: String): Int {
        if (s.length < 2) {
            return s.length
        }

        var best = 0
        var left = 0
        var right = 0

        val used = BooleanArray(128)

        while (right < s.length) {
            while (right < s.length && !used[s[right].code- ' '.code]) {
                used[s[right].code- ' '.code] = true
                right++
            }
            best = max(best, right - left)
            used[s[left++].code- ' '.code] = false
        }

        return best
    }
}
