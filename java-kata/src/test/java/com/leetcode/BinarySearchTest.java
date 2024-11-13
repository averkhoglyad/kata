package com.leetcode;

import org.junit.jupiter.api.Test;
import test.ArrayUtil;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

    BinarySearch it = new BinarySearch();

    @Test
    void test0() {
//        Input: nums = [-1,0,3,5,9,12], target = 9
//        Output: 4
//        Explanation: 9 exists in nums and its index is 4
        assertThat(it.search(ArrayUtil.intArrayOf(-1, 0, 3, 5, 9, 12), 9))
                .isEqualTo(4);
    }

    @Test
    void test1() {
//        Input: nums = [-1,0,3,5,9,12], target = 2
//        Output: -1
//        Explanation: 2 does not exist in nums so return -1
        assertThat(it.search(ArrayUtil.intArrayOf(-1, 0, 3, 5, 9, 12), 2))
                .isEqualTo(-1);
    }
}