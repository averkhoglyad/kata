package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    final Calculator it = new Calculator();

    @Test
    void test0() {
        assertThat(it.calculate(" 1 2 3 "))
                .isEqualTo(123);
        assertThat(it.calculate("10+23"))
                .isEqualTo(33);
        assertThat(it.calculate("10-23"))
                .isEqualTo(-13);
        assertThat(it.calculate("10*23"))
                .isEqualTo(230);
        assertThat(it.calculate("400/20"))
                .isEqualTo(20);
        assertThat(it.calculate("2^10"))
                .isEqualTo(1024);
    }

    @Test
    void test1() {
//        Example 1:
//        Input: s = "3+2*2"
//        Output: 7
        assertThat(it.calculate("3+2*2"))
                .isEqualTo(7);
    }

    @Test
    void test2() {
//        Example 1:
//        Input: s = " 3/2 "
//        Output: 1
        assertThat(it.calculate(" 3/2 "))
                .isEqualTo(1);
    }

    @Test
    void test3() {
//        Example 1:
//        Input: s = " 3+5 / 2 "
//        Output: 7
        assertThat(it.calculate(" 3+5 / 2 "))
                .isEqualTo(5);
    }
}