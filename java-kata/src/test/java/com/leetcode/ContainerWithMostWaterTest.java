package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainerWithMostWaterTest {

    private final ContainerWithMostWater it = new ContainerWithMostWater();

    @Test
    void test1() {
        assertThat(it.maxArea(new int[]{1,8,6,2,5,4,8,3,7})).isEqualTo(49);
    }

    @Test
    void test2() {
        assertThat(it.maxArea(new int[]{1, 1})).isEqualTo(1);
    }

}