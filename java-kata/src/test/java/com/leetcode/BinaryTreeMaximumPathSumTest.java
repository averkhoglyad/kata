package com.leetcode;

import com.leetcode.data.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeMaximumPathSumTest {

    final BinaryTreeMaximumPathSum it = new BinaryTreeMaximumPathSum();

    @Test
    void test1() {
        var root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertThat(it.maxPathSum(root))
                .isEqualTo(6);
    }

    @Test
    void test2() {
        var root = new TreeNode(-10,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );
        assertThat(it.maxPathSum(root))
                .isEqualTo(42);
    }

    @Test
    void test3() {
        var root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4,
                                null,
                                new TreeNode(1)))
        );

        assertThat(it.maxPathSum(root))
                .isEqualTo(48);
    }

    @Test
    void test4() {
        var root = new TreeNode(2, new TreeNode(-1), new TreeNode(-2));
        assertThat(it.maxPathSum(root))
                .isEqualTo(2);
    }

}