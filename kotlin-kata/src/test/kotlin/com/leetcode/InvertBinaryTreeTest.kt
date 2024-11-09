package com.leetcode

import com.leetcode.data.TreeNode
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvertBinaryTreeTest {
    private val it = InvertBinaryTree()

    @Test
    fun test1() {
//        Input: root = [4,2,7,1,3,6,9]
//        Output: [4,7,2,9,6,3,1]
        val input = TreeNode(4,
            TreeNode(2,
                TreeNode(1), TreeNode(3)),
            TreeNode(7,
                TreeNode(6), TreeNode(8))
        )

        val expected = TreeNode(4,
            TreeNode(7,
                TreeNode(8), TreeNode(6)),
            TreeNode(2,
                TreeNode(3), TreeNode(1))
        )

        assertThat(it.invertTree(input))
            .isEqualTo(expected)
    }

    @Test
    fun test2() {
//        Input: root = [2,1,3]
//        Output: [2,3,1]
        val input = TreeNode(2,
            TreeNode(1), TreeNode(3)
        )

        val expected = TreeNode(2,
            TreeNode(3), TreeNode(1)
        )

        assertThat(it.invertTree(input))
            .isEqualTo(expected)
    }

    @Test
    fun test3() {
//        Input: root = []
//        Output: []
        assertThat(it.invertTree(null))
            .isNull()
    }
}