package com.leetcode;

import com.leetcode.data.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeLevelOrderTraversalTest {

    private final BinaryTreeLevelOrderTraversal target = new BinaryTreeLevelOrderTraversal();

    @Test
    void test1() {
//        Input: root = [3,9,20,null,null,15,7]
//        Output: [[3],[9,20],[15,7]]

        var input = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );
        assertThat(target.levelOrder(input))
                .containsExactly(
                        List.of(3),
                        List.of(9, 20),
                        List.of(15, 7)
                );
    }

    @Test
    void test2() {
//        Input: root = [1]
//        Output: [[1]]

        var input = new TreeNode(1);
        assertThat(target.levelOrder(input))
                .containsExactly(List.of(1));
    }

    @Test
    void test3() {
//        Input: root = []
//        Output: []

        assertThat(target.levelOrder(null))
                .isEmpty();
    }
}