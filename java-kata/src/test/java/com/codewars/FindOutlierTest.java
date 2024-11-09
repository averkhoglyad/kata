package com.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static test.ArrayUtil.arrayOf;

class FindOutlierTest {
    @Test
    public void testExample() {
        assertThat(FindOutlier.find(arrayOf(2, 6, 8, -10, 3)))
                .isEqualTo(3);
        assertThat(FindOutlier.find(arrayOf(206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781)))
                .isEqualTo(206847684);
        assertThat(FindOutlier.find(arrayOf(Integer.MAX_VALUE, 0, 1)))
                .isZero();
    }
}
