package org.geeksforgeeks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SortArrayOf012Test {

    final SortArrayOf012 it = new SortArrayOf012();

    @Test
    void test1() {
        var nums = new int[]{0, 2, 1, 2, 0};
        var result = Arrays.stream(nums).sorted().toArray();
        it.sort012(nums, nums.length);
        assertThat(nums)
                .containsExactly(result);
    }

    @Test
    void test2() {
        var nums = new int[]{0, 1, 0};
        var result = Arrays.stream(nums).sorted().toArray();
        it.sort012(nums, nums.length);
        assertThat(nums)
                .containsExactly(result);
    }

    @Test
    void test11() {
        var nums = new int[]{2, 0, 2, 1, 1, 0};
        var result = Arrays.stream(nums).sorted().toArray();
        it.sort012(nums, nums.length);
        assertThat(nums)
                .containsExactly(result);
    }

    @Test
    void test12() {
        var nums = new int[]{2, 0, 1};
        var result = Arrays.stream(nums).sorted().toArray();
        it.sort012(nums, nums.length);
        assertThat(nums)
                .containsExactly(result);
    }

}