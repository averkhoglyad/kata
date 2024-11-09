package com.leetcode;

import com.leetcode.data.ListNode;

/**
 * <h3><a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">Remove Nth Node From End of List</a></h3>
 * <p>
 *     Given the <code>head</code> of a linked list, remove the <code>n</code>-th node from the end of the list and return its head.
 * </p>
 *
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li>The number of nodes in the list is <code>sz</code></li>
 *         <li><code>1 <= sz <= 30</code></li>
 *         <li><code>0 <= Node.val <= 100</code></li>
 *         <li><code>1 <= n <= sz</code></li>
 *     </ul>
 * </p>
 */
public class RemoveNodeFromEndOfLinkedList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        var left = head;
        var right = head;
        for (var i = n; i > 0; i--) {
            right = right.next;
        }

        if (right == null) {
            return head.next;
        }

        while (right.next != null) {
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;

        return head;
    }
}
