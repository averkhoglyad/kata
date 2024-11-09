package com.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HighestLowestKataTest {
    @Test
    public void test1() {
        assertThat(HighestLowestKata.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
                .isEqualTo("42 -9");
    }
}