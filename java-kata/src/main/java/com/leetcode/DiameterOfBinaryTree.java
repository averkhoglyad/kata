package com.leetcode;

import com.leetcode.data.TreeNode;

/**
 * <h3><a href="https://leetcode.com/problems/diameter-of-binary-tree/">Diameter of Binary Tree</a></h3>
 * <p>
 *     Given the <code>root</code> of a binary tree, return <em>the length of the <strong>diameter</strong> of the tree</em>.
 * </p>
 * <p>
 *     The <strong>diameter</strong> of a binary tree is the <strong>length</strong> of the longest path between
 *     any two nodes in a tree. This path may or may not pass through the <code>root</code>.
 * </p>
 * <p>
 *     The <strong>length</strong> of a path between two nodes is represented by the number of edges between them.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li>The number of nodes in the tree is in the range <code>[1, 10^4]</code></li>
 *         <li><code>-100 <= Node.val <= 100</code></li>
 *     </ul>
 * </p>
 */
public class DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {
        return lookUp(root).max();
    }

    private Result lookUp(TreeNode root) {
        if (root == null) return new Result(0, 0);
        var leftResult = lookUp(root.left);
        var rightResult = lookUp(root.right);
        var subtreeMax = Math.max(rightResult.max, leftResult.max);
        var max = Math.max(subtreeMax, leftResult.chain + rightResult.chain);
        return new Result(max, Math.max(leftResult.chain, rightResult.chain) + 1);
    }

    private record Result(int max, int chain) {
    }
}
