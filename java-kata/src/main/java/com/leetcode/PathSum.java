package com.leetcode;

import com.leetcode.data.TreeNode;

/**
 * <h3><a href="https://leetcode.com/problems/path-sum/">Path Sum</a></h3>
 * <p>
 *     Given the <code>root</code> of a binary tree and an integer <code>targetSum</code>, return <code>true</code>
 *     if the tree has a <strong>root-to-leaf</strong> path such that adding up
 *     all the values along the path equals <code>targetSum</code>.
 *     A <strong>leaf</strong> is a node with no children.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li>number of nodes in the tree is in the range <code>[0, 5000]</code></li>
 *         <li><code>-1000 <= Node.val <= 1000</code></li>
 *         <li><code>-1000 <= targetSum <= 1000</code></li>
 *     </ul>
 * </p>
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return process(root, 0, targetSum);
    }

    private boolean process(TreeNode node, int sum, int target) {
        sum = node.val + sum;
        if (node.left == null && node.right == null) {
            return sum == target;
        }
        if (node.left == null) {
            return process(node.right, sum, target);
        }
        if (node.right == null) {
            return process(node.left, sum, target);
        }
        return process(node.left, sum, target) || process(node.right, sum, target);
    }
}
