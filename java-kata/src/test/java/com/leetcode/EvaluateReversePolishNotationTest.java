package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static test.ArrayUtil.arrayOf;

class EvaluateReversePolishNotationTest {

    final EvaluateReversePolishNotation it = new EvaluateReversePolishNotation();

    void test0() {

    }

    @Test
    void test1() {
//        Input: tokens = ["2","1","+","3","*"]
//        Output: 9
//        Explanation: ((2 + 1) * 3) = 9
        assertThat(it.evalRPN(arrayOf("2", "1", "+", "3", "*")))
                .isEqualTo(9);
    }

    @Test
    void test2() {
//        Input: tokens = ["4","13","5","/","+"]
//        Output: 6
//        Explanation: (4 + (13 / 5)) = 6
        assertThat(it.evalRPN(arrayOf("4","13","5","/","+")))
                .isEqualTo(6);
    }

    @Test
    void test3() {
//        Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
//        Output: 22
//        Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
//                = ((10 * (6 / (12 * -11))) + 17) + 5
//                = ((10 * (6 / -132)) + 17) + 5
//                = ((10 * 0) + 17) + 5
//                = (0 + 17) + 5
//                = 17 + 5
//                = 22
        assertThat(it.evalRPN(arrayOf("10","6","9","3","+","-11","*","/","*","17","+","5","+")))
                .isEqualTo(22);
    }
}