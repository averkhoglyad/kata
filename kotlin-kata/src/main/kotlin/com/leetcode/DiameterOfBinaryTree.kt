package com.leetcode

import com.leetcode.data.TreeNode
import kotlin.math.max

/**
 * ### [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/)
 *
 * Given the `root` of a binary tree, return *the length of the **diameter** of the tree*.
 *
 * The **diameter** of a binary tree is the **length** of the longest path between
 * any two nodes in a tree. This path may or may not pass through the `root`.
 *
 * The **length** of a path between two nodes is represented by the number of edges between them.
 *
 * ###### Constraints:
 *  - The number of nodes in the tree is in the range `[1, 10^4]`
 *  - `-100 <= Node.val <= 100`
 */
class DiameterOfBinaryTree {

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        return lookUp(root).max
    }

    private fun lookUp(root: TreeNode?): Result {
        if (root == null) {
            return Result(0, 0)
        }
        val leftResult = lookUp(root.left)
        val rightResult = lookUp(root.right)
        val subtreeMax = max(leftResult.max, rightResult.max)
        val max = max(subtreeMax, leftResult.chain + rightResult.chain)
        return Result(max, max(leftResult.chain, rightResult.chain) + 1)
    }

    private data class Result(val max: Int, val chain: Int)
}
