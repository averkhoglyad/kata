package com.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DnaStrandTest {
    @Test
    public void test01() {
        assertThat(DnaStrand.makeComplement("AAAA"))
                .isEqualTo("TTTT");
    }

    @Test
    public void test02() {
        assertThat(DnaStrand.makeComplement("ATTGC"))
                .isEqualTo("TAACG");
    }

    @Test
    public void test03() {
        assertThat(DnaStrand.makeComplement("GTAT"))
                .isEqualTo("CATA");
    }
}