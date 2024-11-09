package com.leetcode

import com.leetcode.data.TreeNode
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MaximumDepthOfBinaryTreeTest {

    private val it = MaximumDepthOfBinaryTree()

    @Test
    fun test1() {
//        Input: root = [3,9,20,null,null,15,7]
//        Output: 3

        val input = TreeNode(3,
            TreeNode(9),
            TreeNode(20,
                TreeNode(15),
                TreeNode(7)
            )
        )

        assertThat(it.maxDepth(input))
            .isEqualTo(3)
    }

    @Test
    fun test2() {
//        Input: root = [1,null,2]
//        Output: 2

        val input = TreeNode(1,
            null,
            TreeNode(2)
        )

        assertThat(it.maxDepth(input))
            .isEqualTo(2)
    }
}