package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FirstBadVersionTest {

    @Test
    fun test1() {
//        Input: n = 5, bad = 4
//        Output: 4
//        Explanation:
//        call isBadVersion(3) -> false
//        call isBadVersion(5) -> true
//        call isBadVersion(4) -> true
//        Then 4 is the first bad version.

        val it: FirstBadVersion = FirstBadVersion(4)
        assertThat(it.firstBadVersion(5))
            .isEqualTo(4)
    }

    @Test
    fun test2() {
//        Input: n = 1, bad = 1
//        Output: 1

        val it: FirstBadVersion = FirstBadVersion(1)
        assertThat(it.firstBadVersion(1))
            .isEqualTo(1)
    }

    @Test
    fun test3() {
        val it: FirstBadVersion = FirstBadVersion(2147483647)
        assertThat(it.firstBadVersion(2147483647))
            .isEqualTo(2147483647)
    }

    @Test
    fun testX() {
        for (i in 1..1000) {
            for (n in 1..i) {
                val it: FirstBadVersion = FirstBadVersion(n)
                assertThat(it.firstBadVersion(i))
                    .isEqualTo(n)
            }
        }
    }
}