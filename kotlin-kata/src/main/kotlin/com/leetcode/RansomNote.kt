package com.leetcode

/**
 * ### [Ransom Note](https://leetcode.com/problems/ransom-note/)
 *
 * Given two strings `ransomNote` and `magazine`, return `true`
 * if `ransomNote` can be constructed by using the letters from `magazine`
 * and `false` otherwise.
 *
 * Each letter in `magazine` can only be used once in `ransomNote`.
 *
 * ###### Constraints:
 *  - `1 <= ransomNote.length, magazine.length <= 10^5`
 *  - `ransomNote` and `magazine` consist of lowercase English letters
 */
class RansomNote {

    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        var freqs = IntArray(26)

        magazine.forEach {
            freqs[it - 'a']++
        }

        ransomNote.forEach {
            if (freqs[it - 'a'] == 0) {
                return false
            }
            freqs[it - 'a']--
        }

        return true
    }
}
