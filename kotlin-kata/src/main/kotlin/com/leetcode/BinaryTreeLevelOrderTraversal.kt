package com.leetcode

import com.leetcode.data.TreeNode
import kotlin.collections.mutableListOf

/**
 * ### [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)
 *
 * Given the `root` of a binary tree, return
 * *the level order traversal of its nodes' values*.
 * (i.e., from left to right, level by level).
 *
 * ###### Constraints:
 *  * The number of nodes in the tree is in the range `[0, 2000]`.
 *  * `-1000 <= Node.val <= 1000`
 */
class BinaryTreeLevelOrderTraversal {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) {
            return emptyList()
        }

        val result = mutableListOf<List<Int>>()
        val currentLevel = mutableListOf<TreeNode>()
        val nextLevel = mutableListOf<TreeNode>()
        currentLevel.add(root)
        while (currentLevel.isNotEmpty()) {
            result.add(currentLevel.map { it.`val` })
            for (node in currentLevel) {
                node.left?.let { nextLevel.add(it) }
                node.right?.let { nextLevel.add(it) }
            }
            currentLevel.clear()
            currentLevel.addAll(nextLevel)
            nextLevel.clear()
        }

        return result
    }
}
