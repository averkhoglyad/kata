package com.leetcode

import com.leetcode.data.TreeNode
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiameterOfBinaryTreeTest {

    private val target = DiameterOfBinaryTree()

    @Test
    fun test1() {
//        Input: root = [1,2,3,4,5]
//        Output: 3
//        Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

        val tree = TreeNode(1,
            TreeNode(2,
                TreeNode(4),
                TreeNode(5)
            ),
            TreeNode(3)
        )
        assertThat(target.diameterOfBinaryTree(tree))
            .isEqualTo(3)
    }

    @Test
    fun test2() {
//        Input: root = [1,2]
//        Output: 1

        val tree = TreeNode(1,
            TreeNode(2),
            null
        )
        assertThat(target.diameterOfBinaryTree(tree))
            .isEqualTo(1)
    }

    @Test
    fun test3() {
//        Input: root = [4,2,null,1,3]
//        Output: 2

        var tree = TreeNode(4,
            TreeNode(2,
                TreeNode(1),
                TreeNode(3)
            ),
            null
        )

        assertThat(target.diameterOfBinaryTree(tree))
            .isEqualTo(2);
    }
}