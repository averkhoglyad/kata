package com.leetcode;

import com.leetcode.PathMinimumEffort.Point;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PathMinimumEffortTest {

    private final PathMinimumEffort it = new PathMinimumEffort();

    @Test
    void test0() {
        assertThat(it.neighbors(new Point(0, 0), 3, 3))
                .containsExactlyInAnyOrder(new Point(0, 1), new Point(1, 0));
        assertThat(it.neighbors(new Point(3, 3), 3, 3))
                .containsExactlyInAnyOrder(new Point(3, 2), new Point(2, 3));
        assertThat(it.neighbors(new Point(0, 3), 3, 3))
                .containsExactlyInAnyOrder(new Point(0, 2), new Point(1, 3));
        assertThat(it.neighbors(new Point(3, 0), 3, 3))
                .containsExactlyInAnyOrder(new Point(2, 0), new Point(3, 1));

        assertThat(it.neighbors(new Point(0, 1), 3, 3))
                .containsExactlyInAnyOrder(new Point(0, 0), new Point(0, 2), new Point(1, 1));
        assertThat(it.neighbors(new Point(1, 0), 3, 3))
                .containsExactlyInAnyOrder(new Point(0, 0), new Point(2, 0), new Point(1, 1));
        assertThat(it.neighbors(new Point(1, 3), 3, 3))
                .containsExactlyInAnyOrder(new Point(0, 3), new Point(2, 3), new Point(1, 2));
        assertThat(it.neighbors(new Point(3, 1), 3, 3))
                .containsExactlyInAnyOrder(new Point(3, 0), new Point(2, 1), new Point(3, 2));

        assertThat(it.neighbors(new Point(1, 1), 3, 3))
                .containsExactlyInAnyOrder(new Point(0, 1), new Point(2, 1), new Point(1, 0), new Point(1, 2));
        assertThat(it.neighbors(new Point(2, 2), 3, 3))
                .containsExactlyInAnyOrder(new Point(1, 2), new Point(3, 2), new Point(2, 1), new Point(2, 3));
        assertThat(it.neighbors(new Point(2, 1), 3, 3))
                .containsExactlyInAnyOrder(new Point(1, 1), new Point(3, 1), new Point(2, 0), new Point(2, 2));
        assertThat(it.neighbors(new Point(1, 2), 3, 3))
                .containsExactlyInAnyOrder(new Point(0, 2), new Point(2, 2), new Point(1, 1), new Point(1, 3));
    }

    @Test
    void test1() {
        var heights = new int[][]{
                new int[]{1, 2, 2},
                new int[]{3, 8, 2},
                new int[]{5, 3, 5}
        };
        assertThat(it.minimumEffortPath(heights))
                .isEqualTo(2);
    }

    @Test
    void test2() {
        var heights = new int[][]{
                new int[]{1, 2, 3},
                new int[]{3, 8, 4},
                new int[]{5, 3, 5}
        };
        assertThat(it.minimumEffortPath(heights))
                .isEqualTo(1);
    }

    @Test
    void test3() {
        var heights = new int[][]{
                new int[]{1, 2, 1, 1, 1},
                new int[]{1, 2, 1, 2, 1},
                new int[]{1, 2, 1, 2, 1},
                new int[]{1, 2, 1, 2, 1},
                new int[]{1, 1, 1, 2, 1}
        };
        assertThat(it.minimumEffortPath(heights))
                .isEqualTo(0);
    }

}