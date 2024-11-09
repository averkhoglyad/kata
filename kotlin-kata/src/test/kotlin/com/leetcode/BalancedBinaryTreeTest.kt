package com.leetcode

import com.leetcode.data.TreeNode
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalancedBinaryTreeTest {

    private val it = BalancedBinaryTree()

    @Test
    fun test1() {
//        Input: root = [3,9,20,null,null,15,7]
//        Output: true

        val input = TreeNode(3,
            TreeNode(9),
            TreeNode(20,
                TreeNode(15),
                TreeNode(7)
            )
        )

        assertThat(it.isBalanced(input))
            .isTrue()
    }

    @Test
    fun test2() {
//        Input: root = [1,2,2,3,3,null,null,4,4]
//        Output: false

        val input = TreeNode(1,
            TreeNode(2,
                TreeNode(3,
                    TreeNode(4),
                    TreeNode(4)
                ),
                TreeNode(3)
            ),
            TreeNode(2)
        )

        assertThat(it.isBalanced(input))
            .isFalse()
    }

    @Test
    fun test3() {
//        Input: root = []
//        Output: true

        assertThat(it.isBalanced(null))
            .isTrue()
    }

    @Test
    fun test4() {
//        Input: root = [0]
//        Output: true

        assertThat(it.isBalanced(TreeNode()))
            .isTrue()
    }
}