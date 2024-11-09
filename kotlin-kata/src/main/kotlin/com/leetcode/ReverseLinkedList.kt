package com.leetcode

import com.leetcode.data.ListNode

/**
 * ### [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)
 *
 * Given the `head` of a singly linked list, reverse the list, and return *the reversed list*.
 *
 * ###### Constraints:
 *  - The number of nodes in the list is the range `[0, 5000]`.
 *  - `-5000 <= Node.val <= 5000`
 *
 * **Follow up:**
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
class ReverseLinkedList {
    fun reverseList(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }

        var newHead: ListNode = head
        while (head.next != null) {
            val next: ListNode = head.next!!
            head.next = next.next
            next.next = newHead
            newHead = next
        }

        return newHead
    }
}
