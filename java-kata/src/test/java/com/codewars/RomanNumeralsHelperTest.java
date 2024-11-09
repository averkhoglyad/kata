package com.codewars;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.assertj.core.api.Assertions.assertThat;

class RomanNumeralsHelperTest {

    // toRoman
    @ParameterizedTest
    @CsvFileSource(resources = "/roman-nums.csv")
    void testToRoman0(String roman, int num) {
        var res = RomanNumeralsHelper.toRoman(num);
        assertThat(res)
                .withFailMessage(num + " must be \"" + roman + "\", but was \"" + res + "\"")
                .isEqualTo(roman);
    }

    @Test
    void testToRoman1() {
        assertThat(RomanNumeralsHelper.toRoman(1000)).isEqualTo("M");
        assertThat(RomanNumeralsHelper.toRoman(2000)).isEqualTo("MM");
        assertThat(RomanNumeralsHelper.toRoman(3000)).isEqualTo("MMM");
    }

    @Test
    void testToRoman2() {
        assertThat(RomanNumeralsHelper.toRoman(100)).isEqualTo("C");
        assertThat(RomanNumeralsHelper.toRoman(200)).isEqualTo("CC");
        assertThat(RomanNumeralsHelper.toRoman(300)).isEqualTo("CCC");
    }

    @Test
    void testToRoman3() {
        assertThat(RomanNumeralsHelper.toRoman(10)).isEqualTo("X");
        assertThat(RomanNumeralsHelper.toRoman(20)).isEqualTo("XX");
        assertThat(RomanNumeralsHelper.toRoman(30)).isEqualTo("XXX");
    }

    @Test
    void testToRoman4() {
        assertThat(RomanNumeralsHelper.toRoman(3))
                .isEqualTo("III");
    }

    @Test
    void testToRoman5() {
        assertThat(RomanNumeralsHelper.toRoman(58))
                .isEqualTo("LVIII");
    }

    @Test
    void testToRoman6() {
        assertThat(RomanNumeralsHelper.toRoman(1994))
                .isEqualTo("MCMXCIV");
    }

    @Test
    void testToRoman7() {
        assertThat(RomanNumeralsHelper.toRoman(3999))
                .isEqualTo("MMMCMXCIX");
    }

    @Test
    void testToRoman8() {
        assertThat(RomanNumeralsHelper.toRoman(4))
                .isEqualTo("IV");
    }

    @Test
    void testToRoman9() {
        assertThat(RomanNumeralsHelper.toRoman(40))
                .isEqualTo("XL");
    }

    @Test
    void testToRoman10() {
        assertThat(RomanNumeralsHelper.toRoman(400))
                .isEqualTo("CD");
    }

    @Test
    void testToRoman11() {
        assertThat(RomanNumeralsHelper.toRoman(9))
                .isEqualTo("IX");
    }

    @Test
    void testToRoman12() {
        assertThat(RomanNumeralsHelper.toRoman(90))
                .isEqualTo("XC");
    }

    @Test
    void testToRoman13() {
        assertThat(RomanNumeralsHelper.toRoman(900))
                .isEqualTo("CM");
    }

    @Test
    void testToRoman14() {
        assertThat(RomanNumeralsHelper.toRoman(1666))
                .isEqualTo("MDCLXVI");
    }

    // fromRoman
    @ParameterizedTest
    @CsvFileSource(resources = "/roman-nums.csv")
    void testFromRoman0(String roman, int num) {
        var res = RomanNumeralsHelper.fromRoman(roman);
        assertThat(res)
                .withFailMessage(roman + " must be \"" + num + "\", but was \"" + res + "\"")
                .isEqualTo(num);
    }

    @Test
    void testFromRoman1() {
        assertThat(RomanNumeralsHelper.fromRoman("M")).isEqualTo(1000);
        assertThat(RomanNumeralsHelper.fromRoman("MM")).isEqualTo(2000);
        assertThat(RomanNumeralsHelper.fromRoman("MMM")).isEqualTo(3000);
    }

    @Test
    void testFromRoman2() {
        assertThat(RomanNumeralsHelper.fromRoman("C")).isEqualTo(100);
        assertThat(RomanNumeralsHelper.fromRoman("CC")).isEqualTo(200);
        assertThat(RomanNumeralsHelper.fromRoman("CCC")).isEqualTo(300);
    }

    @Test
    void testFromRoman3() {
        assertThat(RomanNumeralsHelper.fromRoman("X")).isEqualTo(10);
        assertThat(RomanNumeralsHelper.fromRoman("XX")).isEqualTo(20);
        assertThat(RomanNumeralsHelper.fromRoman("XXX")).isEqualTo(30);
    }

    @Test
    void testFromRoman4() {
        assertThat(RomanNumeralsHelper.fromRoman("IX")).isEqualTo(9);
        assertThat(RomanNumeralsHelper.fromRoman("XC")).isEqualTo(90);
        assertThat(RomanNumeralsHelper.fromRoman("CM")).isEqualTo(900);
    }

    @Test
    void testFromRoman5() {
        assertThat(RomanNumeralsHelper.fromRoman("IV")).isEqualTo(4);
        assertThat(RomanNumeralsHelper.fromRoman("XL")).isEqualTo(40);
        assertThat(RomanNumeralsHelper.fromRoman("CD")).isEqualTo(400);
    }

    @Test
    void testFromRoman6() {
        assertThat(RomanNumeralsHelper.fromRoman("III")).isEqualTo(3);
    }

    @Test
    void testFromRoman7() {
        assertThat(RomanNumeralsHelper.fromRoman("LVIII")).isEqualTo(58);
    }

    @Test
    void testFromRoman8() {
        assertThat(RomanNumeralsHelper.fromRoman("MCMXCIV")).isEqualTo(1994);
    }

    @Test
    void testFromRoman9() {
        assertThat(RomanNumeralsHelper.fromRoman("MMMCMXCIX")).isEqualTo(3999);
    }

    @Test
    void testFromRoman10() {
        assertThat(RomanNumeralsHelper.fromRoman("MDCLXVI")).isEqualTo(1666);
    }
}