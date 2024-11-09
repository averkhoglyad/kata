package com.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersistTest {

    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertThat(Persist.persistence(39))
                .isEqualTo(3);
        assertThat(Persist.persistence(4))
                .isEqualTo(0);
        assertThat(Persist.persistence(25))
                .isEqualTo(2);
        assertThat(Persist.persistence(999))
                .isEqualTo(4);
    }

}