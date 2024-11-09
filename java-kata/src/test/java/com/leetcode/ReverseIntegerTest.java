package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseIntegerTest {

    private ReverseInteger it = new ReverseInteger();

    @Test
    void test0() {
        assertThat(it.reverse(0)).isEqualTo(0);
    }

    @Test
    void test1() {
        assertThat(it.reverse(123)).isEqualTo(321);
    }

    @Test
    void test2() {
        assertThat(it.reverse(-123)).isEqualTo(-321);
    }

    @Test
    void test3() {
        assertThat(it.reverse(120)).isEqualTo(21);
    }

    @Test
    void test4() {
        assertThat(it.reverse(-120)).isEqualTo(-21);
    }

    @Test
    void test5() {
        assertThat(it.reverse(-100)).isEqualTo(-1);
    }

    @Test
    void test6() {
        assertThat(it.reverse(100)).isEqualTo(1);
    }

    @Test
    void test7() {
        assertThat(it.reverse(-4123)).isEqualTo(-3214);
    }

    @Test
    void test8() {
        assertThat(it.reverse(1_534_236_469)).isEqualTo(0);
    }

    @Test
    void test9() {
        assertThat(it.reverse(-2_147_483_648)).isEqualTo(0);
    }

    @Test
    void test10() {
        assertThat(it.reverse(-2147483412)).isEqualTo(-2143847412);
    }
}