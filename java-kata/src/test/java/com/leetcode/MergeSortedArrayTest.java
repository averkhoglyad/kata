package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortedArrayTest {

    private final MergeSortedArray it = new MergeSortedArray();

    @Test
    void test1() {
        var nums1 = new int[]{1, 2, 3, 0, 0, 0};
        var nums2 = new int[]{2, 5, 6};
        it.merge(nums1, nums1.length - nums2.length, nums2, nums2.length);
        assertThat(nums1)
                .containsExactly(1, 2, 2, 3, 5, 6);
    }

    @Test
    void test2() {
        var nums1 = new int[]{1};
        var nums2 = new int[]{};
        it.merge(nums1, nums1.length - nums2.length, nums2, nums2.length);
        assertThat(nums1)
                .containsExactly(1);
    }

    @Test
    void test3() {
        var nums1 = new int[]{0};
        var nums2 = new int[]{1};
        it.merge(nums1, nums1.length - nums2.length, nums2, nums2.length);
        assertThat(nums1)
                .containsExactly(1);
    }

    @Test
    void test4() {
        var nums1 = new int[]{-1, 0, 0, 3, 3, 3, 0, 0, 0};
        var nums2 = new int[]{1, 2, 2};
        it.merge(nums1, nums1.length - nums2.length, nums2, nums2.length);
        assertThat(nums1)
                .containsExactly(-1, 0, 0, 1, 2, 2, 3, 3, 3);
    }

    @Test
    void test5() {
        var nums1 = new int[]{0, 0, 3, 0, 0, 0, 0, 0, 0};
        var nums2 = new int[]{-1, 1, 1, 1, 2, 3};
        it.merge(nums1, nums1.length - nums2.length, nums2, nums2.length);
        assertThat(nums1)
                .containsExactly(-1,0,0,1,1,1,2,3,3);
    }

}