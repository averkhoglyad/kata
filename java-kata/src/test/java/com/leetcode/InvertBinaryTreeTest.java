package com.leetcode;

import com.leetcode.data.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InvertBinaryTreeTest {

    private final InvertBinaryTree it = new InvertBinaryTree();

    @Test
    void test1() {
//        Input: root = [4,2,7,1,3,6,9]
//        Output: [4,7,2,9,6,3,1]
        var input = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1), new TreeNode(3)),
                new TreeNode(7,
                        new TreeNode(6), new TreeNode(8))
        );

        var expected = new TreeNode(4,
                new TreeNode(7,
                        new TreeNode(8), new TreeNode(6)),
                new TreeNode(2,
                        new TreeNode(3), new TreeNode(1))
        );

        assertThat(it.invertTree(input))
                .isEqualTo(expected);
    }

    @Test
    void test2() {
//        Input: root = [2,1,3]
//        Output: [2,3,1]
        var input = new TreeNode(2,
                new TreeNode(1), new TreeNode(3));

        var expected = new TreeNode(2,
                new TreeNode(3), new TreeNode(1));

        assertThat(it.invertTree(input))
                .isEqualTo(expected);
    }

    @Test
    void test3() {
//        Input: root = []
//        Output: []
        assertThat(it.invertTree(null))
                .isNull();
    }

}