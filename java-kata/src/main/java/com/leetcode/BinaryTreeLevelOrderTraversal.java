package com.leetcode;

import com.leetcode.data.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3><a href="https://leetcode.com/problems/binary-tree-level-order-traversal/">Binary Tree Level Order Traversal</a></h3>
 * <p>
 *     Given the <code>root</code> of a binary tree, return
 *     <em>the level order traversal of its nodes' values</em>.
 *     (i.e., from left to right, level by level).
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li>The number of nodes in the tree is in the range <code>[0, 2000]</code>.</li>
 *         <li><code>-1000 <= Node.val <= 1000</code></li>
 *     </ul>
 * </p>
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> currentLevel = new ArrayList<>();
        List<TreeNode> nextLevel = new ArrayList<>();
        currentLevel.add(root);
        while (!currentLevel.isEmpty()) {
            var values = new ArrayList<Integer>(currentLevel.size());
            for (var node : currentLevel) {
                values.add(node.val);
                if (node.left != null) {
                    nextLevel.add(node.left);
                }
                if (node.right != null) {
                    nextLevel.add(node.right);
                }
            }
            result.add(values);
            currentLevel.clear();
            currentLevel.addAll(nextLevel);
            nextLevel.clear();
        }

        return result;
    }
}
