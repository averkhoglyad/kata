package com.leetcode;

import com.leetcode.data.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PathSumTest {

    final PathSum it = new PathSum();

    @Test
    void test1() {
        var root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertThat(it.hasPathSum(root, 5))
                .isFalse();
    }

    @Test
    void test2() {
        var root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)
                        ),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4,
                                null,
                                new TreeNode(1)
                        )
                )
        );
        assertThat(it.hasPathSum(root, 22))
                .isTrue();
    }

    @Test
    void test3() {
        assertThat(it.hasPathSum(null, 0 ))
                .isFalse();
    }

    @Test
    void test4() {
        var root = new TreeNode(-2, null, new TreeNode(-3));
        assertThat(it.hasPathSum(root, -5))
                .isTrue();
    }
}