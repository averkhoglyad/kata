package com.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PangramCheckerTest {
    @Test
    public void test1() {
        assertThat(new PangramChecker().check("The quick brown fox jumps over the lazy dog."))
                .isTrue();
    }

    @Test
    public void test2() {
        assertThat(new PangramChecker().check("You shall not pass!"))
                .isFalse();
    }
}