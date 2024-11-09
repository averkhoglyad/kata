package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesFromSortedArrayTest {

    final RemoveDuplicatesFromSortedArray it = new RemoveDuplicatesFromSortedArray();

    @Test
    void test1() {
        var nums = new int[]{1, 1, 2};
        var k = it.removeDuplicates(nums);
        assertThat(k)
                .isEqualTo(2);
        var res = Arrays.copyOf(nums, k);
        assertThat(res)
                .isSorted()
                .contains(1, 2);
    }

    @Test
    void test2() {
        var nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        var k = it.removeDuplicates(nums);
        assertThat(k)
                .isEqualTo(5);
        var res = Arrays.copyOf(nums, k);
        assertThat(res)
                .isSorted()
                .contains(0, 1, 2, 3, 4);
    }

}