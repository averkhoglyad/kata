package com.leetcode;

import com.leetcode.data.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LowestCommonAncestorOfBinarySearchTreeTest {

    private final LowestCommonAncestorOfBinarySearchTree it = new LowestCommonAncestorOfBinarySearchTree();

    @Test
    void test1() {
//        Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
//        Output: 6
//        Explanation: The LCA of nodes 2 and 8 is 6.
        var input = new TreeNode(6,
                new TreeNode(2,
                        new TreeNode(0),
                        new TreeNode(4,
                                new TreeNode(3),
                                new TreeNode(5)
                        )
                ),
                new TreeNode(8,
                        new TreeNode(7),
                        new TreeNode(9)
                )
        );

        var result = it.lowestCommonAncestor(input, new TreeNode(2), new TreeNode(8));

        assertThat(result)
                .extracting(el -> el.val)
                .isEqualTo(6);
    }

    @Test
    void test2() {
//        Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
//        Output: 2
//        Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.

        var input = new TreeNode(6,
                new TreeNode(2,
                        new TreeNode(0),
                        new TreeNode(4,
                                new TreeNode(3),
                                new TreeNode(5)
                        )
                ),
                new TreeNode(8,
                        new TreeNode(7),
                        new TreeNode(9)
                )
        );

        var result = it.lowestCommonAncestor(input, new TreeNode(2), new TreeNode(4));

        assertThat(result)
                .extracting(el -> el.val)
                .isEqualTo(2);
    }

    @Test
    void test3() {
//        Input: root = [2,1], p = 2, q = 1
//        Output: 2

        var input = new TreeNode(2,
                new TreeNode(1),
                null
        );

        var result = it.lowestCommonAncestor(input, new TreeNode(2), new TreeNode(1));

        assertThat(result)
                .extracting(el -> el.val)
                .isEqualTo(2);
    }

}