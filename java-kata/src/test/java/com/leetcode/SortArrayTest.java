package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortArrayTest {

    private final SortArray it = new SortArray();

    @Test
    void test1() {
        assertThat(it.sortArray(new int[]{5, 2, 3, 1}))
                .containsExactly(1, 2, 3, 5);
    }

    @Test
    void test2() {
        assertThat(it.sortArray(new int[]{5, 1, 1, 2, 0, 0}))
                .containsExactly(0, 0, 1, 1, 2, 5);
    }

    @Test
    void test3() {
        assertThat(it.sortArray(new int[]{-1, 2, -8, -10}))
                .containsExactly(-10, -8, -1, 2);
    }

    @Test
    void test4() {
        assertThat(it.sortArray(new int[]{-4, 0, 7, 4, 9, -5, -1, 0, -7, -1}))
                .containsExactly(-7, -5, -4, -1, -1, 0, 0, 4, 7, 9);
    }

}