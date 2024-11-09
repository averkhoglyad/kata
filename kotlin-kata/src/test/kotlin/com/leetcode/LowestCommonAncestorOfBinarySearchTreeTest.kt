package com.leetcode

import com.leetcode.data.TreeNode
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.util.function.Function

internal class LowestCommonAncestorOfBinarySearchTreeTest {

    private val it = LowestCommonAncestorOfBinarySearchTree()

    @Test
    fun test1() {
//        Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
//        Output: 6
//        Explanation: The LCA of nodes 2 and 8 is 6.
        val input = TreeNode(6,
            TreeNode(2,
                TreeNode(0),
                TreeNode(4,
                    TreeNode(3),
                    TreeNode(5)
                )
            ),
            TreeNode(8,
                TreeNode(7),
                TreeNode(9)
            )
        )

        val result = it.lowestCommonAncestor(input, TreeNode(2), TreeNode(8))

        assertThat<TreeNode?>(result)
            .extracting { el: TreeNode? -> el!!.`val` }
            .isEqualTo(6)
    }

    @Test
    fun test2() {
//        Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
//        Output: 2
//        Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.

        val input = TreeNode(6,
            TreeNode(2,
                TreeNode(0),
                TreeNode(4,
                    TreeNode(3),
                    TreeNode(5)
                )
            ),
            TreeNode(8,
                TreeNode(7),
                TreeNode(9)
            )
        )

        val result = it.lowestCommonAncestor(input, TreeNode(2), TreeNode(4))

        assertThat<TreeNode?>(result)
            .extracting { el: TreeNode? -> el!!.`val` }
            .isEqualTo(2)
    }

    @Test
    fun test3() {
//        Input: root = [2,1], p = 2, q = 1
//        Output: 2

        val input = TreeNode(2,
            TreeNode(1),
            null
        )

        val result = it.lowestCommonAncestor(input, TreeNode(2), TreeNode(1))

        assertThat<TreeNode?>(result)
            .extracting { el: TreeNode? -> el!!.`val` }
            .isEqualTo(2)
    }
}