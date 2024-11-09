package com.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DubstepTest {
    @Test
    public void Test1() {
        assertThat(Dubstep.SongDecoder("WUBWUBABCWUB"))
                .isEqualTo("ABC");
    }

    @Test
    public void Test2() {
        assertThat(Dubstep.SongDecoder("RWUBWUBWUBLWUB"))
                .isEqualTo("R L");
    }
}