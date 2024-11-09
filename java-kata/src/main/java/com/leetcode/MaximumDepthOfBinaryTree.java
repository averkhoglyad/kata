package com.leetcode;

import com.leetcode.data.TreeNode;

/**
 * <h3><a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">Maximum Depth of Binary Tree</a></h3>
 * <p>
 *     Given the <code>root</code> of a binary tree, return its <em>maximum depth</em>.
 * </p>
 * <p>
 *     A binary tree's <strong>maximum depth</strong> is the number of nodes along the longest path
 *     from the root node down to the farthest leaf node.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li>The number of nodes in the tree is in the range <code>[0, 10^4]</code></li>
 *         <li><code>-100 <= Node.val <= 100</code></li>
 *     </ul>
 * </p>
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
