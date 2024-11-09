package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddBinaryTest {

    private final AddBinary it = new AddBinary();

    @Test
    void test1() {
//        Input: a = "11", b = "1"
//        Output: "100"

        assertThat(it.addBinary("11", "1"))
                .isEqualTo("100");
    }

    @Test
    void test2() {
//        Input: a = "1010", b = "1011"
//        Output: "10101"

        assertThat(it.addBinary("1010", "1011"))
                .isEqualTo("10101");
    }

    @Test
    void test3() {
//        Input: a =     "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
//               b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
//        Output:    "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000"

        var a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        var b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        var expected = "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000";
        assertThat(it.addBinary(a, b))
                .isEqualTo(expected);
    }
}