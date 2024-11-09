package com.leetcode;

import com.leetcode.data.ListNode;

/**
 * <h3><a href="https://leetcode.com/problems/merge-two-sorted-lists/description/">Merge Two Sorted Lists</a></h3>
 *
 * <p>
 * You are given the heads of two sorted linked lists <code>list1</code> and <code>list2</code>. Merge the two lists in
 * a one <strong>sorted</strong> list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 * </p>
 *
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li>The number of nodes in both lists is in the range <code>[0, 50]</code></li>
 *         <li><code>-100 <= Node.val <= 100</code></li>
 *         <li>Both <code>list1</code> and <code>list2</code> are sorted in <strong>non-decreasing</strong> order</li>
 *     </ul>
 * </p>
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var left = list1;
        var right = list2;
        ListNode head = null, current = null;
        while (left != null || right != null) {
            ListNode next;
            if (left == null) {
                next = right;
                right = right.next;
            } else if (right == null) {
                next = left;
                left = left.next;
            } else {
                if (left.val < right.val) {
                    next = left;
                    left = left.next;
                } else {
                    next = right;
                    right = right.next;
                }
            }

            if (current == null) {
                head = next;
                current = next;
            } else {
                current.next = next;
                current = next;
            }
            next.next = null;
        }
        return head;
    }

}
