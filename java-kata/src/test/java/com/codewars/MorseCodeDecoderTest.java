package com.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() {
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."))
                .isEqualTo("HEY JUDE");
    }
}