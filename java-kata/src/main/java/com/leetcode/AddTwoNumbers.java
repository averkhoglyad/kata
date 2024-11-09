package com.leetcode;

import com.leetcode.data.ListNode;

/**
 * <h3><a href="https://leetcode.com/problems/add-two-numbers/">Add Two Numbers</a></h3>
 * <p>
 *     You are given two non-empty linked lists representing two non-negative integers.
 *     The digits are stored in reverse order, and each of their nodes contains a single digit.
 *     Add the two numbers and return the sum as a linked list.
 * </p>
 * <p>
 *     You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * </p>
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int extra = 0;

        ListNode result = null;
        ListNode current = null;

        ListNode currentL1 = l1;
        ListNode currentL2 = l2;

        while (currentL1 != null || currentL2 != null) {
            var firstDigit = currentL1 != null ? currentL1.val : 0;
            var secondDigit = currentL2 != null ? currentL2.val : 0;

            var node = currentL1 == null ? currentL2 : currentL1;

            currentL1 = currentL1 != null ? currentL1.next : null;
            currentL2 = currentL2 != null ? currentL2.next : null;

            var resDigit = firstDigit + secondDigit + extra;
            if (resDigit > 9) {
                extra = (resDigit - resDigit % 10) / 10;
                resDigit = resDigit % 10;
            } else {
                extra = 0;
            }

            node.val = resDigit;
            node.next = null;

            if (result == null) {
                result = current = node;
            } else {
                current.next = node;
                current = node;
            }
        }

        if (extra > 0) {
            current.next = new ListNode(extra);
        }

        return result;
    }
}
