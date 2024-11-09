package com.leetcode

import kotlin.math.max

/**
 * ### [Add Binary](https://leetcode.com/problems/add-binary/)
 *
 * Given two binary strings `a` and `b`, return their sum as a binary string.
 *
 * ###### Constraints:
 *  * `1 <= a.length, b.length <= 10^4`
 *  * `a` and `b`> consist only of `'0'` or `'1'` characters.
 *  * Each string does not contain leading zeros except for the zero itself.
 */
class AddBinary {

    fun addBinary(a: String, b: String): String {
        val capacity = max(a.length, b.length) + 1
        var digits = CharArray(capacity) { '0' }
        var current = 0
        for (i in 1.. capacity) {
            if (a.digitAt(i) == '1') current += 1
            if (b.digitAt(i) == '1') current += 1
            digits[capacity - i] = ((current % 2) + '0'.code).toChar()
            current /= 2
        }

        val sb = StringBuilder(capacity)
        for (i in 0..< capacity) {
            if (i == 0 && digits[i] == '0'){
                continue
            }
            sb.append(digits[i])
        }
        return sb.toString()
    }

    private inline fun String.digitAt(i: Int): Char {
        return if (i <= this.length) this[this.length - i] else '0'
    }
}
