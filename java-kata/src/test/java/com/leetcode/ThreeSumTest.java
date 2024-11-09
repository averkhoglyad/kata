package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static test.ArrayUtil.arrayOf;

class ThreeSumTest {

    private final ThreeSum it = new ThreeSum();

    @Test
    void test0() {
        var result = it.threeSum(arrayOf(-1, 0, 1, 2, -1, -4));
        assertThat(result)
                .containsExactlyInAnyOrder(List.of(-1, -1, 2), List.of(-1, 0, 1));
    }

    @Test
    void test1() {
        var result = it.threeSum(arrayOf(0, 1, 1));
        assertThat(result).isEmpty();
    }

    @Test
    void test2() {
        var result = it.threeSum(arrayOf(0, 0, 0));
        assertThat(result)
                .isEqualTo(List.of(List.of(0, 0, 0)));
    }

    @Test
    void test3() {
        var result = it.threeSum(arrayOf(-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6));
        assertThat(result)
                .containsExactlyInAnyOrder(
                        List.of(-4,-2,6),
                        List.of(-4,0,4),
                        List.of(-4,1,3),
                        List.of(-4,2,2),
                        List.of(-2,-2,4),
                        List.of(-2,0,2)
                );
    }
}