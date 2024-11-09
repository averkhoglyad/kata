package com.leetcode;

import com.leetcode.data.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LinkedListCycleTest {

    private final LinkedListCycle it = new LinkedListCycle();

    @Test
    void test1() {
//        Input: head = [3,2,0,-4], pos = 1
//        Output: true
//        Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

        var last = new ListNode(4);
        var head = new ListNode(3, new ListNode(2, new ListNode(0, last)));
        last.next = head.next;

        assertThat(it.hasCycle(head))
                .isTrue();
    }

    @Test
    void test2() {
//        Input: head = [1,2], pos = 0
//        Output: true
//        Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

        var last = new ListNode(2);
        var head = new ListNode(1, last);
        last.next = head;

        assertThat(it.hasCycle(head))
                .isTrue();
    }

    @Test
    void test3() {
//        Input: head = [1], pos = -1
//        Output: false
//        Explanation: There is no cycle in the linked list.

        var head = new ListNode(1);

        assertThat(it.hasCycle(head))
                .isFalse();
    }
}