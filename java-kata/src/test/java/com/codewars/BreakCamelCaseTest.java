package com.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BreakCamelCaseTest {
    @Test
    public void tests() {
        assertThat(BreakCamelCase.camelCase("camelCasing"))
                .isEqualTo("camel Casing");
        assertThat(BreakCamelCase.camelCase("camelCasingTest"))
                .isEqualTo("camel Casing Test");
        assertThat(BreakCamelCase.camelCase("camelcasingtest"))
                .isEqualTo("camelcasingtest");
    }
}