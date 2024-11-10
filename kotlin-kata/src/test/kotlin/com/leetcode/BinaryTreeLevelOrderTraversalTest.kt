package com.leetcode

import com.leetcode.data.TreeNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BinaryTreeLevelOrderTraversalTest {

    private val target: BinaryTreeLevelOrderTraversal = BinaryTreeLevelOrderTraversal()

    @Test
    fun test1() {
//        Input: root = [3,9,20,null,null,15,7]
//        Output: [[3],[9,20],[15,7]]

        val input = TreeNode(
            3,
            TreeNode(9),
            TreeNode(
                20,
                TreeNode(15),
                TreeNode(7)
            )
        )
        assertThat(target.levelOrder(input))
            .containsExactly(
                listOf(3),
                listOf(9, 20),
                listOf(15, 7)
            )
    }

    @Test
    fun test2() {
//        Input: root = [1]
//        Output: [[1]]

        val input = TreeNode(1)
        assertThat(target.levelOrder(input))
            .containsExactly(listOf(1))
    }

    @Test
    fun test3() {
//        Input: root = []
//        Output: []

        assertThat(target.levelOrder(null))
            .isEmpty()
    }
}