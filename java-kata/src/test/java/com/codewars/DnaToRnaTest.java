package com.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DnaToRnaTest {
    @Test
    public void testDna() {
        var b = new DnaToRna();
        assertThat(b.dnaToRna("TTTT"))
                .isEqualTo("UUUU");
    }

    @Test
    public void testDna2() {
        var b = new DnaToRna();
        assertThat(b.dnaToRna("GCAT"))
                .isEqualTo("GCAU");
    }
}