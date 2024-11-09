package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReorderRoutesToLeadToZeroTest {

    private final ReorderRoutesToLeadToZero it = new ReorderRoutesToLeadToZero();

    @Test
    void test1() {
        int[][] connections = {
                new int[]{0, 1},
                new int[]{1, 3},
                new int[]{2, 3},
                new int[]{4, 0},
                new int[]{4, 5}
        };
        assertThat(it.minReorder(6, connections))
                .isEqualTo(3);
    }

    @Test
    void test2() {
        int[][] connections = {
                new int[]{1, 0},
                new int[]{1, 2},
                new int[]{3, 2},
                new int[]{3, 4}
        };
        assertThat(it.minReorder(5, connections))
                .isEqualTo(2);
    }

    @Test
    void test3() {
        int[][] connections = {
                new int[]{1, 0},
                new int[]{2, 0}
        };
        assertThat(it.minReorder(3, connections))
                .isEqualTo(0);
    }
}