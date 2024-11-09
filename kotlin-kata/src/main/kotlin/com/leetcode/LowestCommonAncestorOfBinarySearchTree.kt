package com.leetcode

import com.leetcode.data.TreeNode

/**
 * ### [Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)
 *
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
 *
 * According to the [definition of LCA on Wikipedia](https://en.wikipedia.org/wiki/Lowest_common_ancestor):
 * “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 *
 * ###### Constraints:
 *  - The number of nodes in the tree is in the range `[2, 10^5]`
 *  - `-10^9 <= Node.val <= 10^9`
 *  - All `Node.val` are unique.
 *  - `p != q`
 *  - `p` and `q` will exist in the BST.
 */
class LowestCommonAncestorOfBinarySearchTree {

    // loop
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null || p == null || q == null) {
            return null
        }

        var node = root
        while (node != null) {
            when {
                isLowestCommonAncestor(node, p, q) -> return node
                isLowestCommonAncestorInRightTree(node, p, q) -> node = node.right
                isLowestCommonAncestorInLeftTree(node, p, q) -> node = node.left
            }
        }

        return null
    }

    // recursion
    fun lowestCommonAncestor0(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null || p == null || q == null) {
            return null
        }
        if (isLowestCommonAncestorInRightTree(root, p, q)) {
            return lowestCommonAncestor(root.right, p, q)
        }
        if (isLowestCommonAncestorInLeftTree(root, p, q)) {
            return lowestCommonAncestor(root.left, p, q)
        }
        return root
    }

    private inline fun isLowestCommonAncestor(node: TreeNode, p: TreeNode, q: TreeNode): Boolean {
        return (node.`val` == p.`val` || node.`val` == q.`val`) ||
                (p.`val` < node.`val` && node.`val` < q.`val`) ||
                (q.`val` < node.`val` && node.`val` < p.`val`)
    }

    private inline fun isLowestCommonAncestorInRightTree(node: TreeNode, p: TreeNode, q: TreeNode): Boolean {
        return node.`val` < p.`val` && node.`val` < q.`val`
    }

    private inline fun isLowestCommonAncestorInLeftTree(node: TreeNode, p: TreeNode, q: TreeNode): Boolean {
        return node.`val` > p.`val` && node.`val` > q.`val`
    }
}
