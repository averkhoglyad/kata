package com.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StripCommentsTest {

    @Test
    public void stripComments() {
        assertThat(StripComments.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"}))
                .isEqualTo("apples, pears\ngrapes\nbananas");

        assertThat(StripComments.stripComments("a #b\nc\nd $e f g", new String[]{"#", "$"}))
                .isEqualTo("a\nc\nd");
    }

}