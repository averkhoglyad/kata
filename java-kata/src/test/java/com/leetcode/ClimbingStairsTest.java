package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClimbingStairsTest {

    private final ClimbingStairs target = new ClimbingStairs();

    @Test
    void test1() {
//        Input: n = 2
//        Output: 2
//        Explanation: There are two ways to climb to the top.
//        1. 1 step + 1 step
//        2. 2 steps

        assertThat(target.climbStairs(2))
                .isEqualTo(2);
    }

    @Test
    void test2() {
//        Input: n = 3
//        Output: 3
//        Explanation: There are three ways to climb to the top.
//        1. 1 step + 1 step + 1 step
//        2. 1 step + 2 steps
//        3. 2 steps + 1 step

        assertThat(target.climbStairs(3))
                .isEqualTo(3);
    }

    @Test
    void test3() {
        assertThat(target.climbStairs(4))
                .isEqualTo(5);
    }

    @Test
    void test4() {
        assertThat(target.climbStairs(5))
                .isEqualTo(8);
    }

    @Test
    void test6() {
        assertThat(target.climbStairs(6))
                .isEqualTo(13);
    }
}