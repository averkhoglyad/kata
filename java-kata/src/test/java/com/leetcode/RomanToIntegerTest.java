package com.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.assertj.core.api.Assertions.assertThat;

class RomanToIntegerTest {

    private final RomanToInteger it = new RomanToInteger();

    @ParameterizedTest
    @CsvFileSource(resources = "/roman-nums.csv")
    void test0(String roman, int num) {
        var res = it.romanToInt(roman);
        assertThat(res)
                .withFailMessage(roman + " must be \"" + num + "\", but was \"" + res + "\"")
                .isEqualTo(num);
    }

    @Test
    void test1() {
        assertThat(it.romanToInt("M")).isEqualTo(1000);
        assertThat(it.romanToInt("MM")).isEqualTo(2000);
        assertThat(it.romanToInt("MMM")).isEqualTo(3000);
    }

    @Test
    void test2() {
        assertThat(it.romanToInt("C")).isEqualTo(100);
        assertThat(it.romanToInt("CC")).isEqualTo(200);
        assertThat(it.romanToInt("CCC")).isEqualTo(300);
    }

    @Test
    void test3() {
        assertThat(it.romanToInt("X")).isEqualTo(10);
        assertThat(it.romanToInt("XX")).isEqualTo(20);
        assertThat(it.romanToInt("XXX")).isEqualTo(30);
    }

    @Test
    void test4() {
        assertThat(it.romanToInt("IX")).isEqualTo(9);
        assertThat(it.romanToInt("XC")).isEqualTo(90);
        assertThat(it.romanToInt("CM")).isEqualTo(900);
    }

    @Test
    void test5() {
        assertThat(it.romanToInt("IV")).isEqualTo(4);
        assertThat(it.romanToInt("XL")).isEqualTo(40);
        assertThat(it.romanToInt("CD")).isEqualTo(400);
    }

    @Test
    void test10() {
        assertThat(it.romanToInt("III")).isEqualTo(3);
    }

    @Test
    void test11() {
        assertThat(it.romanToInt("LVIII")).isEqualTo(58);
    }

    @Test
    void test12() {
        assertThat(it.romanToInt("MCMXCIV")).isEqualTo(1994);
    }

    @Test
    void test13() {
        assertThat(it.romanToInt("MMMCMXCIX")).isEqualTo(3999);
    }
}