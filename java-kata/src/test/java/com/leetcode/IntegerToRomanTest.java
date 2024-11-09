package com.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.assertj.core.api.Assertions.assertThat;

class IntegerToRomanTest {

    private final IntegerToRoman it = new IntegerToRoman();

    @ParameterizedTest
    @CsvFileSource(resources = "/roman-nums.csv")
    void test00(String roman, int num) {
        var res = it.intToRoman(num);
        assertThat(res)
                .withFailMessage(num + " must be \"" + roman + "\", but was \"" + res + "\"")
                .isEqualTo(roman);
    }

    @Test
    void test01() {
        assertThat(it.intToRoman(1000)).isEqualTo("M");
        assertThat(it.intToRoman(2000)).isEqualTo("MM");
        assertThat(it.intToRoman(3000)).isEqualTo("MMM");
    }

    @Test
    void test02() {
        assertThat(it.intToRoman(100)).isEqualTo("C");
        assertThat(it.intToRoman(200)).isEqualTo("CC");
        assertThat(it.intToRoman(300)).isEqualTo("CCC");
    }

    @Test
    void test03() {
        assertThat(it.intToRoman(10)).isEqualTo("X");
        assertThat(it.intToRoman(20)).isEqualTo("XX");
        assertThat(it.intToRoman(30)).isEqualTo("XXX");
    }

    @Test
    void test1() {
        assertThat(it.intToRoman(3))
                .isEqualTo("III");
    }

    @Test
    void test2() {
        assertThat(it.intToRoman(58))
                .isEqualTo("LVIII");
    }

    @Test
    void test3() {
        assertThat(it.intToRoman(1994))
                .isEqualTo("MCMXCIV");
    }

    @Test
    void test4() {
        assertThat(it.intToRoman(3999))
                .isEqualTo("MMMCMXCIX");
    }

    @Test
    void test5() {
        assertThat(it.intToRoman(4))
                .isEqualTo("IV");
    }

    @Test
    void test6() {
        assertThat(it.intToRoman(40))
                .isEqualTo("XL");
    }

    @Test
    void test7() {
        assertThat(it.intToRoman(400))
                .isEqualTo("CD");
    }

    @Test
    void test8() {
        assertThat(it.intToRoman(9))
                .isEqualTo("IX");
    }

    @Test
    void test9() {
        assertThat(it.intToRoman(90))
                .isEqualTo("XC");
    }

    @Test
    void test10() {
        assertThat(it.intToRoman(900))
                .isEqualTo("CM");
    }
}