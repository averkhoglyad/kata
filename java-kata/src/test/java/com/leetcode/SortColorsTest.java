package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SortColorsTest {

    private final SortColors it = new SortColors();

    @Test
    void test1() {
        var nums = new int[]{2, 0, 2, 1, 1, 0};
        var result = Arrays.stream(nums).sorted().toArray();
        it.sortColors(nums);
        assertThat(nums)
                .containsExactly(result);
    }

    @Test
    void test2() {
        var nums = new int[]{2, 0, 1};
        var result = Arrays.stream(nums).sorted().toArray();
        it.sortColors(nums);
        assertThat(nums)
                .containsExactly(result);
    }

}