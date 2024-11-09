package com.leetcode;

import com.leetcode.data.TreeNode;

/**
 * <h3><a href="https://leetcode.com/problems/binary-tree-maximum-path-sum/">Binary Tree Maximum Path Sum</a></h3>
 * <p>
 *      A <strong>path</strong> in a binary tree is a sequence of nodes where
 *      each pair of adjacent nodes in the sequence has an edge connecting them.
 *      A node can only appear in the sequence <strong>at most once</strong>.
 *      Note that the path does not need to pass through the root.
 * </p>
 * <p>
 *      The <strong>path sum</strong> of a path is the sum of the node's values in the path.
 * </p>
 * <p>
 *      Given the <code>root</code> of a binary tree, return the maximum <strong>path sum</strong>
 *      of any <strong>non-empty</strong> path.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li>The number of nodes in the tree is in the range <code>[1, 3 * 10^4]</code></li>
 *         <li><code>-1000 <= Node.val <= 1000</code></li>
 *     </ul>
 * </p>
 */
public class BinaryTreeMaximumPathSum {

    int result = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        process(root);
        return result;
    }

    private int process(TreeNode node) {
        if (node == null) {
            return 0;
        }
        var left = process(node.left);
        var right = process(node.right);

        var localMax = Math.max(node.val, Math.max(left, right) + node.val);

        result = Math.max(result, Math.max(localMax, left + right + node.val));

        return localMax;
    }

}
