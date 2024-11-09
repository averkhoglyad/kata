package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MajorityElementTest {

    private final MajorityElement it = new MajorityElement();

    @Test
    void test1() {
        var nums = new int[]{3, 2, 3};
        assertThat(it.majorityElement(nums))
                .isEqualTo(3);
    }

    @Test
    void test2() {
        var nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        assertThat(it.majorityElement(nums))
                .isEqualTo(2);
    }

    @Test
    void test3() {
        var nums = new int[]{1};
        assertThat(it.majorityElement(nums))
                .isEqualTo(1);
    }

    @Test
    void test4() {
        var nums = new int[]{3,3,4};
        assertThat(it.majorityElement(nums))
                .isEqualTo(3);
    }
}