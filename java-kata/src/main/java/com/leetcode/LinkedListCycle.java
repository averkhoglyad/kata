package com.leetcode;

import com.leetcode.data.ListNode;

/**
 * <h3><a href="https://leetcode.com/problems/linked-list-cycle/">Linked List Cycle</a></h3>
 * <p>
 *     Given head, the <code>head</code> of a linked list, determine if the linked list has a cycle in it.
 * </p>
 * <p>
 *     There is a cycle in a linked list if there is some node in the list that can be reached
 *     again by continuously following the <code>next</code> pointer. Internally, <code>pos</code> is used
 *     to denote the index of the node that tail's <code>next</code> pointer is connected to.
 *     <strong>Note that <code>pos</code> is not passed as a parameter.</strong>
 * </p>
 * <p>
 *     Return <code>true</code> if there is a cycle in the linked list. Otherwise, return <code>false</code>.
 * </p>
 *
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li>The number of the nodes in the list is in the range <code>[0, 10^4]</code></li>
 *         <li><code>-10^5 <= Node.val <= 10^5</code></li>
 *         <li><code>pos</code> is <code>-1</code> or a valid index in the linked-list.</li>
 *     </ul>
 * </p>
 * <p>
 *     <strong>Follow up:</strong> Can you solve it using <code>O(1)</code> (i.e. constant) memory?
 * </p>
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        var fast = head;
        var slow = head;

        while (true) {
            fast = fast.next != null ? fast.next.next : null;
            slow = slow.next;
            if (fast == null) {
                return false;
            }
            if (fast == slow) {
                return true;
            }
        }
    }
}