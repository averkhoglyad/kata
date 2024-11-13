package com.leetcode;

import org.junit.jupiter.api.Test;
import test.ArrayUtil;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateTest {

    final ContainsDuplicate it = new ContainsDuplicate();

    @Test
    void test0() {
        /*
        Input: nums = [1,2,3,1]
        Output: true
        */
        assertThat(it.containsDuplicate(ArrayUtil.intArrayOf(1, 2, 3, 1)))
                .isTrue();
    }

    @Test
    void test1() {
        /*
        Input: nums = [1,2,3,4]
        Output: false
        */
        assertThat(it.containsDuplicate(ArrayUtil.intArrayOf(1, 2, 3, 4)))
                .isFalse();
    }

    @Test
    void test2() {
        /*
        Input: nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true
        */
        assertThat(it.containsDuplicate(ArrayUtil.intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)))
                .isTrue();
    }
}