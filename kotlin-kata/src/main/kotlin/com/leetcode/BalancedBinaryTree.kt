package com.leetcode

import com.leetcode.data.TreeNode
import kotlin.math.absoluteValue
import kotlin.math.max

/**
 * ### [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/)
 *
 * Given a binary tree, determine if it is **height-balanced**.
 *
 * A **height-balanced** binary tree is a binary tree in which
 * the depth of the two subtrees of every node never differs by more than one.
 */
class BalancedBinaryTree {
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }

        return isBalanced(balancedAwareHeight(root.left), balancedAwareHeight(root.right))
    }

    // Positive - balanced, negative - no
    private fun balancedAwareHeight(node: TreeNode?): Int {
        if (node == null) {
            return 0
        }

        var leftHeight = balancedAwareHeight(node.left)
        var rightHeight = balancedAwareHeight(node.right)
        var height = max(leftHeight.absoluteValue, rightHeight.absoluteValue) + 1

        return if (isBalanced(leftHeight, rightHeight)) height else -height
    }

    private inline fun isBalanced(leftHeight: Int, rightHeight: Int): Boolean {
        return leftHeight >= 0 && rightHeight >= 0 && (leftHeight - rightHeight).absoluteValue <= 1
    }
}
