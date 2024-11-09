package com.leetcode;

import com.leetcode.data.ListNode;

/**
 * <h3><a href="https://leetcode.com/problems/reverse-linked-list/">Reverse Linked List</a></h3>
 * <p>
 *     Given the <code>head</code> of a singly linked list, reverse the list, and return <em>the reversed list</em>.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li>The number of nodes in the list is the range <code>[0, 5000]</code>.</li>
 *         <li><code>-5000 <= Node.val <= 5000</code></li>
 *     </ul>
 * </p>
 * <p>
 *     <strong>Follow up:</strong>
 *     A linked list can be reversed either iteratively or recursively. Could you implement both?
 * </p>
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        var newHead = head;
        while (head.next != null) {
            var next = head.next;
            head.next = next.next;
            next.next = newHead;
            newHead = next;
        }

        return newHead;
    }
}
