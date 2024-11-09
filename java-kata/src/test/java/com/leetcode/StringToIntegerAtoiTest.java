package com.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class StringToIntegerAtoiTest {

    private StringToIntegerAtoi it = new StringToIntegerAtoi();

    @ParameterizedTest
    @ValueSource(strings = {"", "0", "asdf", "0000", "+-"})
    void test0(String str) {
        assertThat(it.myAtoi(str)).isZero();
    }

    @Test
    void test1() {
        assertThat(it.myAtoi("42")).isEqualTo(42);
    }

    @Test
    void test2() {
        assertThat(it.myAtoi("-42")).isEqualTo(-42);
    }

    @Test
    void test3() {
        assertThat(it.myAtoi("   -42")).isEqualTo(-42);
    }

    @Test
    void test4() {
        assertThat(it.myAtoi("4193 with words")).isEqualTo(4193);
    }

    @Test
    void test5() {
        assertThat(it.myAtoi("+4193 with words")).isEqualTo(4193);
    }

    @Test
    void test6() {
        assertThat(it.myAtoi("+-12")).isZero();
    }

    @Test
    void test7() {
        assertThat(it.myAtoi("2147483648")).isEqualTo(2147483647);
    }

    @Test
    void test8() {
        assertThat(it.myAtoi("-2147483648")).isEqualTo(-2147483648);
    }

    @Test
    void test9() {
        assertThat(it.myAtoi("-91283472332")).isEqualTo(-2147483648);
    }

    @Test
    void test10() {
        assertThat(it.myAtoi("91283472332")).isEqualTo(2147483647);
    }

    @Test
    void test11() {
        assertThat(it.myAtoi("-000000000000001")).isEqualTo(-1);
    }
}