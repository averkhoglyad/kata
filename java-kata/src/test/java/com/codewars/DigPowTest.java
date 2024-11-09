package com.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DigPowTest {
    @Test
    public void Test1() {
        assertThat(DigPow.digPow(89, 1))
                .isOne();
    }

    @Test
    public void Test2() {
        assertThat(DigPow.digPow(92, 1))
                .isEqualTo(-1);
    }

    @Test
    public void Test3() {
        assertThat(DigPow.digPow(46288, 3))
                .isEqualTo(51);
    }
}