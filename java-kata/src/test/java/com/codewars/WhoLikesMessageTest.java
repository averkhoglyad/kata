package com.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WhoLikesMessageTest {
    @Test
    public void staticTests() {
        assertThat(WhoLikesMessage.whoLikesIt())
                .isEqualTo("no one likes this");
        assertThat(WhoLikesMessage.whoLikesIt("Peter"))
                .isEqualTo("Peter likes this");
        assertThat(WhoLikesMessage.whoLikesIt("Jacob", "Alex"))
                .isEqualTo("Jacob and Alex like this");
        assertThat(WhoLikesMessage.whoLikesIt("Max", "John", "Mark"))
                .isEqualTo("Max, John and Mark like this");
        assertThat(WhoLikesMessage.whoLikesIt("Alex", "Jacob", "Mark", "Max"))
                .isEqualTo("Alex, Jacob and 2 others like this");
    }
}