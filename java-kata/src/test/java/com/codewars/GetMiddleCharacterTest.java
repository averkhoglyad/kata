package com.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GetMiddleCharacterTest {
    @Test
    public void evenTests() {
        assertThat(GetMiddleCharacter.getMiddle("test"))
                .isEqualTo("es");
        assertThat(GetMiddleCharacter.getMiddle("middle"))
                .isEqualTo("dd");
    }

    @Test
    public void oddTests() {
        assertThat(GetMiddleCharacter.getMiddle("testing"))
                .isEqualTo("t");
        assertThat(GetMiddleCharacter.getMiddle("A"))
                .isEqualTo("A");
    }
}