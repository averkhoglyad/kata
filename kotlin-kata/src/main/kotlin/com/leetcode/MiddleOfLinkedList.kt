package com.leetcode

import com.leetcode.data.ListNode

/**
 * ### [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/)
 *
 * Given the `head` of a singly linked list, return the middle node of the linked list.
 *
 * If there are two middle nodes, return **the second middle** node.
 *
 * ###### Constraints:
 *  - The number of nodes in the list is in the range `[1, 100]`
 *  - `1 <= Node.val <= 100`
 */
class MiddleOfLinkedList {

    fun middleNode(head: ListNode?): ListNode? {
        var fast = head
        var slow = head
        while (fast?.next != null) {
            fast = fast.next?.next
            slow = slow?.next
        }
        return slow
    }
}
