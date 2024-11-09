package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FloodFillTest {

    private final FloodFill it = new FloodFill();

    @Test
    void test1() {
//        Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
//        Output: [[2,2,2],[2,2,0],[2,0,1]]
//        Explanation:
//        From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel), all pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels) are colored with the new color.
//        Note the bottom corner is not colored 2, because it is not horizontally or vertically connected to the starting pixel.

        var image = new int[][]{
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        var expected = new int[][]{
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        };
        var result = it.floodFill(image, 1, 1, 2);

        assertThat(result)
                .isDeepEqualTo(expected);
    }

    @Test
    void test2() {
//        Input: image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 0
//        Output: [[0,0,0],[0,0,0]]
//        Explanation:
//        The starting pixel is already colored with 0, which is the same as the target color. Therefore, no changes are made to the image.

        var image = new int[][]{
                {0, 0, 0},
                {0, 0, 0}
        };
        var expected = new int[][]{
                {0, 0, 0},
                {0, 0, 0}
        };
        var result = it.floodFill(image, 0, 0, 0);

        assertThat(result)
                .isDeepEqualTo(expected);
    }

}