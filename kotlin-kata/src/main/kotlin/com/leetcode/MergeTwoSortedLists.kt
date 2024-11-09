package com.leetcode

import com.leetcode.data.ListNode

/**
 * ### [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/description/)
 *
 * You are given the heads of two sorted linked lists `list1` and `list2`. Merge the two lists in
 * a one **sorted** list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 *
 * ###### Constraints:
 *  - The number of nodes in both lists is in the range `[0, 50]`
 *  - `-100 <= Node.val <= 100`
 *  - Both `list1` and `list2` are sorted in **non-decreasing** order
 */
class MergeTwoSortedLists {

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var left:ListNode? = list1
        var right:ListNode? = list2
        var head:ListNode? = null
        var tail:ListNode? = null

        while (left != null || right != null) {
            val node = ListNode()
            if (left != null && (right == null || left.`val` <= right.`val`)) {
                node.`val` = left.`val`
                left = left.next
            } else {
                node.`val` = right!!.`val`
                right = right.next
            }

            if (tail != null) {
                tail.next = node
            }
            tail = node
            if (head == null) {
                head = tail
            }
        }
        return head
    }

}