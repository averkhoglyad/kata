package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ZigzagConversionTest {

    private ZigzagConversion it = new ZigzagConversion();

    @Test
    void test1() {
        // Input: s = "PAYPALISHIRING", numRows = 3
        // Output: "PAHNAPLSIIGYIR"
        // Explanation:
        // P   A   H   N
        // A P L S I I G
        // Y   I   R
        assertThat(it.convert("PAYPALISHIRING", 3))
                .isEqualTo("PAHNAPLSIIGYIR");
    }

    @Test
    void test2() {
        // Input: s = "PAYPALISHIRING", numRows = 4
        // Output: "PINALSIGYAHRPI"
        // Explanation:
        // P     I    N
        // A   L S  I G
        // Y A   H R
        // P     I
        assertThat(it.convert("PAYPALISHIRING", 4))
                .isEqualTo("PINALSIGYAHRPI");
    }

    @Test
    void test3() {
        // Input: s = "A", numRows = 1
        // Output: "A"
        assertThat(it.convert("A", 1)).isEqualTo("A");
    }

    @Test
    void test4() {
        // Input: s = "AB", numRows = 1
        // Output: "AB"
        assertThat(it.convert("AB", 1)).isEqualTo("AB");
    }
}