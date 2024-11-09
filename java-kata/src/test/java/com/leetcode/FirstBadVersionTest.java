package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FirstBadVersionTest {

    @Test
    void test1() {
//        Input: n = 5, bad = 4
//        Output: 4
//        Explanation:
//        call isBadVersion(3) -> false
//        call isBadVersion(5) -> true
//        call isBadVersion(4) -> true
//        Then 4 is the first bad version.

        var it = new FirstBadVersion(4);
        assertThat(it.firstBadVersion(5))
                .isEqualTo(4);
    }

    @Test
    void test2() {
//        Input: n = 1, bad = 1
//        Output: 1

        var it = new FirstBadVersion(1);
        assertThat(it.firstBadVersion(1))
                .isEqualTo(1);
    }

    @Test
    void test3() {
        var it = new FirstBadVersion(2147483647);
        assertThat(it.firstBadVersion(2147483647))
                .isEqualTo(2147483647);
    }

    @Test
    void testX() {
        for (int i = 1; i <= 1000; i++) {
            for (int n = 1; n <= i; n++) {
                var it = new FirstBadVersion(n);
                assertThat(it.firstBadVersion(i))
                        .isEqualTo(n);
            }
        }
    }
}