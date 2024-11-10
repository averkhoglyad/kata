package com.leetcode

import java.util.Stack

/**
 * ### [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/)
 *
 * You are given an array of strings tokens that represents an arithmetic expression
 * in a [Reverse Polish Notation](http://en.wikipedia.org/wiki/Reverse_Polish_notation).
 * Evaluate the expression. Return an integer that represents the value of the expression.
 *
 * **Note that:**
 *  - The valid operators are `'+'`, `'-'`, `'*'` and `'/'`.
 *  - Each operand may be an integer or another expression.
 *  - The division between two integers always **truncates toward zero**.
 *  - There will not be any division by zero.
 *  - The input represents a valid arithmetic expression in a reverse polish notation.
 *  - The answer and all the intermediate calculations can be represented in a **32-bit** integer.
 *
 * ###### Constraints:
 *  - `1 <= tokens.length <= 10^4`
 *  - `tokens[i]` is either an operator: `'+'`, `'-'`, `'*'` or `'/'` or an integer in the range `[-200, 200]`
 */
class EvaluateReversePolishNotation {

    fun evalRPN(tokens: Array<String>): Int {
        val stack = Stack<Int>()

        tokens.forEach {
            when (it) {
                "+" -> stack.doPlus()
                "-" -> stack.doMinus()
                "*" -> stack.doMultiply()
                "/" -> stack.doDivide()
                else -> stack.push(it.toInt())
            }
        }

        return stack.peek()
    }

    private inline fun Stack<Int>.doPlus() {
        val right = this.pop()
        val left = this.pop()
        this.push(left + right)
    }

    private inline fun Stack<Int>.doMinus() {
        val right = this.pop()
        val left = this.pop()
        this.push(left - right)
    }

    private inline fun Stack<Int>.doMultiply() {
        val right = this.pop()
        val left = this.pop()
        this.push(left * right)
    }

    private inline fun Stack<Int>.doDivide() {
        val right = this.pop()
        val left = this.pop()
        this.push(left / right)
    }
}
