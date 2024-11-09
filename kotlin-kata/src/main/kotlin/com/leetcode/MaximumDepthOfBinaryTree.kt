package com.leetcode

import com.leetcode.data.TreeNode
import kotlin.math.max

/**
 * ### [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
 *
 * Given the `root` of a binary tree, return its *maximum depth*.
 *
 * A binary tree's **maximum depth** is the number of nodes along the longest path
 * from the root node down to the farthest leaf node.
 *
 * ###### Constraints:
 *  - The number of nodes in the tree is in the range `[0, 10^4]`
 *  - `-100 <= Node.val <= 100`
 */
class MaximumDepthOfBinaryTree {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        if (root.left == null && root.right == null) {
            return 1
        }
        return 1 + max(maxDepth(root.left), maxDepth(root.right))
    }
}
