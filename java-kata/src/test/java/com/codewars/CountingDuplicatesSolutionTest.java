package com.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountingDuplicatesSolutionTest {
    @Test
    public void abcdeReturnsZero() {
        assertThat(CountingDuplicates.duplicateCount("abcde"))
                .isZero();
    }

    @Test
    public void abcdeaReturnsOne() {
        assertThat(CountingDuplicates.duplicateCount("abcdea"))
                .isOne();
    }

    @Test
    public void indivisibilityReturnsOne() {
        assertThat(CountingDuplicates.duplicateCount("indivisibility"))
                .isOne();
    }

    @Test
    public void reallyLongStringContainingDuplicatesReturnsThree() {
        var testThousandA = new String(new char[1000]).replace('\0', 'a');
        var testHundredB = new String(new char[100]).replace('\0', 'b');
        var testTenC = new String(new char[10]).replace('\0', 'c');
        var test1CapitalA = new String(new char[1]).replace('\0', 'A');
        var test1d = new String(new char[1]).replace('\0', 'd');
        var test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;

        assertThat(CountingDuplicates.duplicateCount(test))
                .isEqualTo(3);
    }
}
