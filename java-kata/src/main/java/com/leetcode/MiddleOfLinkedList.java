package com.leetcode;

import com.leetcode.data.ListNode;

/**
 * <h3><a href="https://leetcode.com/problems/middle-of-the-linked-list/">Middle of the Linked List</a></h3>
 * <p>
 *     Given the <code>head</code> of a singly linked list, return the middle node of the linked list.
 * </p>
 * <p>
 *     If there are two middle nodes, return <strong>the second middle</strong> node.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li>The number of nodes in the list is in the range <code>[1, 100]</code></li>
 *         <li><code>1 <= Node.val <= 100</code></li>
 *     </ul>
 * </p>
 */
public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {
        var fast = head;
        var slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next != null ? fast.next.next : fast.next;
        }
        return slow;
    }
}
