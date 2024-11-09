package com.leetcode;

import com.leetcode.data.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DiameterOfBinaryTreeTest {

    private final DiameterOfBinaryTree target = new DiameterOfBinaryTree();

    @Test
    void test1() {
//        Input: root = [1,2,3,4,5]
//        Output: 3
//        Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

        var tree = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)
                ),
                new TreeNode(3)
        );
        assertThat(target.diameterOfBinaryTree(tree))
                .isEqualTo(3);
    }

    @Test
    void test2() {
//        Input: root = [1,2]
//        Output: 1

        var tree = new TreeNode(1,
                new TreeNode(2),
                null
        );
        assertThat(target.diameterOfBinaryTree(tree))
                .isEqualTo(1);
    }

    @Test
    void test3() {
//        Input: root = [4,2,null,1,3]
//        Output: 2

        var tree = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)
                ),
                null
        );
        assertThat(target.diameterOfBinaryTree(tree))
                .isEqualTo(2);
    }
}