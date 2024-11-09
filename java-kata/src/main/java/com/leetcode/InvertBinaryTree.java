package com.leetcode;

import com.leetcode.data.TreeNode;

/**
 * <h3><a href="https://leetcode.com/problems/invert-binary-tree/">Invert Binary Tree</a></h3>
 * <p>
 *     Given the <code>root</code> of a binary tree, invert the tree, and return its root.
 * </p>
 *
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li>The number of nodes in the tree is in the range <code>[0, 100]</code></li>
 *         <li><code>-100 <= Node.val <= 100</code></li>
 *     </ul>
 * </p>
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        var left = invertTree(root.right);
        var right = invertTree(root.left);
        root.left = left;
        root.right = right;
        
        return root;
    }
}
