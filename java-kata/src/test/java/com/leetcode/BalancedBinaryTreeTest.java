package com.leetcode;

import com.leetcode.data.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BalancedBinaryTreeTest {

    private final BalancedBinaryTree it = new BalancedBinaryTree();

    @Test
    void test1() {
//        Input: root = [3,9,20,null,null,15,7]
//        Output: true

        var input = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7))
        );

        assertThat(it.isBalanced(input))
                .isTrue();
    }

    @Test
    void test2() {
//        Input: root = [1,2,2,3,3,null,null,4,4]
//        Output: false

        var input = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4),
                                new TreeNode(4)),
                        new TreeNode(3)),
                new TreeNode(2)
        );

        assertThat(it.isBalanced(input))
                .isFalse();
    }

    @Test
    void test3() {
//        Input: root = []
//        Output: true

        assertThat(it.isBalanced(null))
                .isTrue();
    }

    @Test
    void test4() {
//        Input: root = [0]
//        Output: true

        assertThat(it.isBalanced(new TreeNode()))
                .isTrue();
    }
}