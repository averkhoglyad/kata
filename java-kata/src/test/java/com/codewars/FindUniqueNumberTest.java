package com.codewars;

import org.junit.jupiter.api.Test;
import test.ArrayUtil;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class FindUniqueNumberTest {

    private static final double PRECISION = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        assertThat(FindUniqueNumber.findUniq(ArrayUtil.doubleArrayOf(0.0, 1.0, 0.0)))
                .isEqualTo(1.0, within(PRECISION));
        assertThat(FindUniqueNumber.findUniq(ArrayUtil.doubleArrayOf(1.0, 1.0, 1.0, 2.0, 1.0, 1.0)))
                .isEqualTo(2.0, within(PRECISION));
        assertThat(FindUniqueNumber.findUniq(ArrayUtil.doubleArrayOf(1.0, 1.0, 4.0)))
                .isEqualTo(4.0, within(PRECISION));
    }
}