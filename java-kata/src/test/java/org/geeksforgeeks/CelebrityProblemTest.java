package org.geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CelebrityProblemTest {

    final CelebrityProblem it = new CelebrityProblem();

    @Test
    void test1() {
        var n = 3;
        var m = new int[][]{
                new int[] {0, 1, 0},
                new int[] {0, 0, 0},
                new int[] {0, 1, 0},
        };
        assertThat(it.celebrity(m, n))
                .isEqualTo(1);
    }

    @Test
    void test2() {
        var n = 2;
        var m = new int[][]{
                new int[] {0, 1},
                new int[] {1, 0}
        };
        assertThat(it.celebrity(m, n))
                .isEqualTo(-1);
    }

}