package com.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CamelCaseConvertTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        assertThat(CamelCaseConvert.toCamelCase(input))
                .isEqualTo("theStealthWarrior");
    }

    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        assertThat(CamelCaseConvert.toCamelCase(input))
                .isEqualTo("theStealthWarrior");
    }
}