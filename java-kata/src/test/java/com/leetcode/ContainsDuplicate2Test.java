package com.leetcode;

import org.junit.jupiter.api.Test;
import test.ArrayUtil;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicate2Test {

    final ContainsDuplicate2 it = new ContainsDuplicate2();

    @Test
    void test0() {
        /*
        Input: nums = [1,2,3,1], k = 3
        Output: true
         */
        assertThat(it.containsNearbyDuplicate(ArrayUtil.intArrayOf(1, 2, 3, 1), 3))
                .isTrue();
    }

    @Test
    void test1() {
        /*
        Input: nums = [1,0,1,1], k = 1
        Output: true
         */
        assertThat(it.containsNearbyDuplicate(ArrayUtil.intArrayOf(1, 0, 1, 1), 1))
                .isTrue();
    }

    @Test
    void test2() {
        /*
        Input: nums = [1,2,3,1,2,3], k = 2
        Output: false
         */
        assertThat(it.containsNearbyDuplicate(ArrayUtil.intArrayOf(1, 2, 3, 1, 2, 3), 2))
                .isFalse();
    }

    @Test
    void test3() {
        /*
        Input: nums = [1,2,3,4,5,6,7], k = 2
        Output: false
         */
        assertThat(it.containsNearbyDuplicate(ArrayUtil.intArrayOf(1, 2, 3, 4, 5, 6, 7), 2))
                .isFalse();
    }
}
