package com.leetcode

import com.leetcode.data.ListNode

/**
 * ### [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)
 *
 * Given head, the `head` of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached
 * again by continuously following the `next` pointer. Internally, `pos` is used
 * to denote the index of the node that tail's `next` pointer is connected to.
 * **Note that `pos` is not passed as a parameter.**
 *
 * Return `true` if there is a cycle in the linked list. Otherwise, return `false`.
 *
 * ###### Constraints:
 *  - The number of the nodes in the list is in the range `[0, 10^4]`
 *  - `-10^5 <= Node.val <= 10^5`
 *  - `pos` is `-1` or a valid index in the linked-list.
 *
 * **Follow up:** Can you solve it using `O(1)` (i.e. constant) memory?
 */
class LinkedListCycle {
    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) {
            return false
        }

        var fast = head
        var slow = head
        while (true) {
            fast = fast?.next?.next
            slow = slow?.next
            if (fast == null) {
                return false
            }
            if (fast == slow) {
                return true
            }
        }
    }
}
