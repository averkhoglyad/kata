package com.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AbbreviatorTest {

    private Abbreviator abbr = new Abbreviator();

    @Test
    public void testInternationalization() {
        assertThat(abbr.abbreviate("internationalization"))
                .isEqualTo("i18n");
    }

    @Test
    public void testElephantRides() {
        assertThat(abbr.abbreviate("elephant-rides are really fun!"))
                .isEqualTo("e6t-r3s are r4y fun!");
    }

}