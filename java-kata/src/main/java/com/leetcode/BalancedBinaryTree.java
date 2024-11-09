package com.leetcode;

import com.leetcode.data.TreeNode;

/**
 * <h3><a href="https://leetcode.com/problems/balanced-binary-tree/">Balanced Binary Tree</a></h3>
 * <p>
 *     Given a binary tree, determine if it is <strong>height-balanced</strong>.
 * </p>
 * <p>
 *     A <strong>height-balanced</strong> binary tree is a binary tree in which
 *     the depth of the two subtrees of every node never differs by more than one.
 * </p>
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        var leftHeight = balancedHeight(root.left);
        var rightHeight = balancedHeight(root.right);
        return leftHeight >= 0 && rightHeight >= 0 && Math.abs(leftHeight - rightHeight) <= 1;
    }

    private int balancedHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        var leftHeight = balancedHeight(root.left);
        var rightHeight = balancedHeight(root.right);
        var height = Math.max(Math.abs(leftHeight), Math.abs(rightHeight)) + 1;
        var isBalanced = leftHeight >= 0 && rightHeight >= 0 && Math.abs(leftHeight - rightHeight) <= 1;

        return isBalanced ? height : -height;
    }
}
