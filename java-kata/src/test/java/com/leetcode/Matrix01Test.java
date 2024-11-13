package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static test.ArrayUtil.arrayOf;
import static test.ArrayUtil.intArrayOf;

class Matrix01Test {

    private final Matrix01 target = new Matrix01();

    @Test
    void test1() {
//        Input: mat = [[0,0,0],[0,1,0],[0,0,0]]
//        Output: [[0,0,0],[0,1,0],[0,0,0]]

        var input = arrayOf(intArrayOf(0, 0 ,0), intArrayOf(0, 1 ,0), intArrayOf(0, 0 ,0));
        var expected = arrayOf(intArrayOf(0, 0 ,0), intArrayOf(0, 1 ,0), intArrayOf(0, 0 ,0));

        assertThat(target.updateMatrix(input))
                .isDeepEqualTo(expected);
    }

    @Test
    void test2() {
//        Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
//        Output: [[0,0,0],[0,1,0],[1,2,1]]

        var input = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 1, 1));
        var expected = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 2, 1));

        assertThat(target.updateMatrix(input))
                .isDeepEqualTo(expected);
    }

    @Test
    void test3() {
//        Input: mat = [[1,1,0,0,1,0,0,1,1,0],
//                      [1,0,0,1,0,1,1,1,1,1],
//                      [1,1,1,0,0,1,1,1,1,0],
//                      [0,1,1,1,0,1,1,1,1,1],
//                      [0,0,1,1,1,1,1,1,1,0],
//                      [1,1,1,1,1,1,0,1,1,1],
//                      [0,1,1,1,1,1,1,0,0,1],
//                      [1,1,1,1,1,0,0,1,1,1],
//                      [0,1,0,1,1,0,1,1,1,1],
//                      [1,1,1,0,1,0,1,1,1,1]]

//        Output:      [[2,1,0,0,1,0,0,1,1,0],
//                      [1,0,0,1,0,1,1,2,2,1],
//                      [1,1,1,0,0,1,2,2,1,0],
//                      [0,1,2,1,0,1,2,3,2,1],
//                      [0,0,1,2,1,2,1,2,1,0],
//                      [1,1,2,3,2,1,0,1,1,1],
//                      [0,1,2,3,2,1,1,0,0,1],
//                      [1,2,1,2,1,0,0,1,1,2],
//                      [0,1,0,1,1,0,1,2,2,3],
//                      [1,2,1,0,1,0,1,2,3,4]]

        var input = arrayOf(
                intArrayOf(1, 1, 0, 0, 1, 0, 0, 1, 1, 0),
                intArrayOf(1, 0, 0, 1, 0, 1, 1, 1, 1, 1),
                intArrayOf(1, 1, 1, 0, 0, 1, 1, 1, 1, 0),
                intArrayOf(0, 1, 1, 1, 0, 1, 1, 1, 1, 1),
                intArrayOf(0, 0, 1, 1, 1, 1, 1, 1, 1, 0),
                intArrayOf(1, 1, 1, 1, 1, 1, 0, 1, 1, 1),
                intArrayOf(0, 1, 1, 1, 1, 1, 1, 0, 0, 1),
                intArrayOf(1, 1, 1, 1, 1, 0, 0, 1, 1, 1),
                intArrayOf(0, 1, 0, 1, 1, 0, 1, 1, 1, 1),
                intArrayOf(1, 1, 1, 0, 1, 0, 1, 1, 1, 1)
        );
        var expected = arrayOf(
                intArrayOf(2, 1, 0, 0, 1, 0, 0, 1, 1, 0),
                intArrayOf(1, 0, 0, 1, 0, 1, 1, 2, 2, 1),
                intArrayOf(1, 1, 1, 0, 0, 1, 2, 2, 1, 0),
                intArrayOf(0, 1, 2, 1, 0, 1, 2, 3, 2, 1),
                intArrayOf(0, 0, 1, 2, 1, 2, 1, 2, 1, 0),
                intArrayOf(1, 1, 2, 3, 2, 1, 0, 1, 1, 1),
                intArrayOf(0, 1, 2, 3, 2, 1, 1, 0, 0, 1),
                intArrayOf(1, 2, 1, 2, 1, 0, 0, 1, 1, 2),
                intArrayOf(0, 1, 0, 1, 1, 0, 1, 2, 2, 3),
                intArrayOf(1, 2, 1, 0, 1, 0, 1, 2, 3, 4)
        );

        assertThat(target.updateMatrix(input))
                .isDeepEqualTo(expected);
    }

    @Test
    void test4() {
//        Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
//        Output: [[0,0,0],[0,1,0],[1,2,1]]

        var input = arrayOf(intArrayOf(0));
        var expected = arrayOf(intArrayOf(0));

        assertThat(target.updateMatrix(input))
                .isDeepEqualTo(expected);
    }
}