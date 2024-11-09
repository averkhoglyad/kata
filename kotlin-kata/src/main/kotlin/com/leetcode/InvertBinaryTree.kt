package com.leetcode

import com.leetcode.data.TreeNode

/**
 * ### [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/)
 *
 * Given the `root` of a binary tree, invert the tree, and return its root.
 *
 * ###### Constraints:
 *  - The number of nodes in the tree is in the range `[0, 100]`
 *  - `-100 <= Node.val <= 100`
 */
class InvertBinaryTree {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }

        var left = invertTree(root.left)
        var right = invertTree(root.right)
        root.left = right
        root.right = left

        return root
    }
}
