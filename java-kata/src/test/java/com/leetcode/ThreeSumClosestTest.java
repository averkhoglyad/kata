package com.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ThreeSumClosestTest {

    @Test
    void test1() {
        doTest(new int[]{-1, 2, 1, -4}, 1, 2);
    }

    @Test
    void test2() {
        doTest(new int[]{0, 0, 0}, 1, 0);
    }

    @Test
    void test3() {
        doTest(new int[]{1, 1, 1, 0}, -100, 2);
    }

    @Test
    void test4() {
        doTest(new int[]{-1, 1, 1, 0}, 1, 1);
    }

    @Test
    void test5() {
        doTest(new int[]{1, 2, 3, 0}, 5, 5);
    }

    @Test
    void test6() {
        doTest(new int[]{1, 2, 3, 0}, 6, 6);
    }

    @Test
    void test7() {
        doTest(new int[]{-1000,-5,-5,-5,-5,-5,-5,-1,-1,-1}, -14, -15);
    }

    private void doTest(int[] nums, int target, int expected) {
        var res = new ThreeSumClosest().threeSumClosest(nums, target);
        assertThat(res).isEqualTo(expected);
    }
}