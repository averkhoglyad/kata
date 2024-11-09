package com.leetcode;

import com.leetcode.data.TreeNode;

/**
 * <h3><a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/">Lowest Common Ancestor of a Binary Search Tree</a></h3>
 * <p>
 *     Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
 * </p>
 * <p>
 *     According to the <a href="https://en.wikipedia.org/wiki/Lowest_common_ancestor">definition of LCA on Wikipedia</a>:
 *     “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li>The number of nodes in the tree is in the range <code>[2, 10^5]</code></li>
 *         <li><code>-10^9 <= Node.val <= 10^9</code></li>
 *         <li>All <code>Node.val</code> are unique.</li>
 *         <li><code>p != q</code></li>
 *         <li><code>p</code> and <code>q</code> will exist in the BST.</li>
 *     </ul>
 * </p>
 */
public class LowestCommonAncestorOfBinarySearchTree {

    // loop based
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        var node = root;
        while (node != null) {
            if (node.val < p.val && node.val < q.val) {
                node = node.right;
                continue;
            }
            if (node.val > p.val && node.val > q.val) {
                node = node.left;
                continue;
            }
            return node;
        }
        return null;
    }

    // recursion based
    public TreeNode lowestCommonAncestor0(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }
}
