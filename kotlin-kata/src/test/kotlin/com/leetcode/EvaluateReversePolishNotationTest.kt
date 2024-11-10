package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvaluateReversePolishNotationTest {

    val it: EvaluateReversePolishNotation = EvaluateReversePolishNotation()

    @Test
    fun test1() {
//        Input: tokens = ["2","1","+","3","*"]
//        Output: 9
//        Explanation: ((2 + 1) * 3) = 9

        val input = arrayOf("2", "1", "+", "3", "*")
        assertThat(it.evalRPN(input))
            .isEqualTo(9)
    }

    @Test
    fun test2() {
//        Input: tokens = ["4","13","5","/","+"]
//        Output: 6
//        Explanation: (4 + (13 / 5)) = 6

        val input = arrayOf("4", "13", "5", "/", "+")
        assertThat(it.evalRPN(input))
            .isEqualTo(6)
    }

    @Test
    fun test3() {
//        Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
//        Output: 22
//        Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
//                = ((10 * (6 / (12 * -11))) + 17) + 5
//                = ((10 * (6 / -132)) + 17) + 5
//                = ((10 * 0) + 17) + 5
//                = (0 + 17) + 5
//                = 17 + 5
//                = 22

        val input = arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")
        assertThat(it.evalRPN(input))
            .isEqualTo(22)
    }
}