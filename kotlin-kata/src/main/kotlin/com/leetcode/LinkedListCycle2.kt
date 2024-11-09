package com.leetcode

import com.leetcode.data.ListNode

/**
 * ### [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/)
 *
 * Given the `head` of a linked list, return the node where the cycle begins.
 * If there is no cycle, return `null`.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached
 * again by continuously following the `next` pointer. Internally, `pos` is used
 * to denote the index of the node that tail's `next` pointer is connected to.
 * **Note that `pos` is not passed as a parameter.**
 *
 * **Do not modify** the linked list.
 *
 * ###### Constraints:
 *  - The number of the nodes in the list is in the range `[0, 10^4]`
 *  - `-10^5 <= Node.val <= 10^5`
 *  - `pos` is `-1` or a valid index in the linked-list.
 *
 * **Follow up:** Can you solve it using `O(1)` (i.e. constant) memory?
 */
class LinkedListCycle2 {
    fun detectCycle(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }

        var fast = head
        var slow = head
        while (true) {
            fast = fast?.next?.next
            slow = slow?.next
            if (fast == null) {
                return null
            }
            if (fast == slow) {
                break
            }
        }

        fast = head
        while (fast != slow) {
            fast = fast?.next
            slow = slow?.next
        }

        return slow
    }
}
