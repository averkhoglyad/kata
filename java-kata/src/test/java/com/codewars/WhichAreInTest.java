package com.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static test.ArrayUtil.arrayOf;

class WhichAreInTest {
    @Test
    public void test1() {
        var left = arrayOf("arp", "live", "strong");
        var right = arrayOf("lively", "alive", "harp", "sharp", "armstrong");
        var expected = arrayOf("arp", "live", "strong");
        assertThat(WhichAreIn.inArray(left, right))
                .isEqualTo(expected);
    }
}