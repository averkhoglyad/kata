package com.leetcode;

import com.leetcode.data.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumDepthOfBinaryTreeTest {

    private final MaximumDepthOfBinaryTree it = new MaximumDepthOfBinaryTree();

    @Test
    void test1() {
//        Input: root = [3,9,20,null,null,15,7]
//        Output: 3

        var input = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );

        assertThat(it.maxDepth(input))
                .isEqualTo(3);
    }

    @Test
    void test2() {
//        Input: root = [1,null,2]
//        Output: 2

        var input = new TreeNode(1,
                null,
                new TreeNode(2)
        );

        assertThat(it.maxDepth(input))
                .isEqualTo(2);
    }
}