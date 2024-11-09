package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BasicCalculatorTest {

    final BasicCalculator it = new BasicCalculator();

    @Test
    void test0() {
        assertThat(it.calculate(" 1 2 3"))
                .isEqualTo(123);
        assertThat(it.calculate(" - 321"))
                .isEqualTo(-321);
//        assertThat(it.calculate(" -666"))
//                .isEqualTo(666);
    }

    @Test
    void test1() {
//        Example 1:
//        Input: s = "1 + 1"
//        Output: 2
        assertThat(it.calculate("1 + 1"))
                .isEqualTo(2);
    }

    @Test
    void test2() {
//        Example 1:
//        Input: s = " 2-1 + 2 "
//        Output: 3
        assertThat(it.calculate(" 2-1 + 2 "))
                .isEqualTo(3);
    }

    @Test
    void test3() {
//        Example 1:
//        Input: s = "(1+(4+5+2)-3)+(6+8)"
//        Output: 23
        assertThat(it.calculate("(1+(4+5+2)-3)+(6+8)"))
                .isEqualTo(23);
    }

    @Test
    void test4() {
        assertThat(it.calculate("(6)-(8)-(7)+(1+(6))"))
                .isEqualTo(-2);
    }

    @Test
    void test5() {
        assertThat(it.calculate("2-4-(8+2-6+(8+4-(1)+8-10))"))
                .isEqualTo(-15);
    }

}