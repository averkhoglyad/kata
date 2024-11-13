package com.leetcode;

import org.junit.jupiter.api.Test;
import test.ArrayUtil;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    private final TwoSum it = new TwoSum();

    @Test
    void test0() {
        // Input: nums = [2,7,11,15], target = 9
        // Output: [0,1]
        // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        var res = it.twoSum(ArrayUtil.intArrayOf(2, 7, 11, 15), 9);
        assertThat(res)
                .containsExactlyInAnyOrder(0, 1);

    }

    @Test
    void test1() {
        // Input: nums = [3,2,4], target = 6
        // Output: [1,2]
        var res = it.twoSum(ArrayUtil.intArrayOf(3,2,4), 6);
        assertThat(res)
                .containsExactlyInAnyOrder(1, 2);

    }

    @Test
    void test2() {
        // Input: nums = [3,3], target = 6
        // Output: [0,1]
        var res = it.twoSum(ArrayUtil.intArrayOf(3, 3), 6);
        assertThat(res)
                .containsExactlyInAnyOrder(0, 1);
    }
}