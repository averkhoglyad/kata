package com.leetcode

import kotlin.collections.ArrayDeque

/**
 * ### [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
 *
 * Given a string *s* containing just the characters
 * `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`,
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *  1. Open brackets must be closed by the same type of brackets.
 *  1. Open brackets must be closed in the correct order.
 *  1. Every close bracket has a corresponding open bracket of the same type.
 *
 * ###### Constraints:
 *  - `1 <= s.length <= 10^4`
 *  - `s` consists of parentheses only `()[]{}`.
 */
class ValidParentheses {

    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        s.forEach { ch ->
            if (ch.isOpen()) {
                stack.addLast(ch.switchOpenToClose())
            } else {
                if (stack.isEmpty() || stack.removeLast() != ch) return false
            }
        }
        return stack.isEmpty()
    }

    private fun Char.isOpen(): Boolean {
        return when (this) {
            '(', '[', '{' -> true
            else -> false
        }
    }

    private fun Char.switchOpenToClose(): Char {
        return when (this) {
            '(' -> ')'
            '[' -> ']'
            '{' -> '}'
            else -> throw IllegalArgumentException("Unexpected value: $this")
        }
    }
}
