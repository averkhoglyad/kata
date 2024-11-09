package com.leetcode

import com.leetcode.data.ListNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkedListCycle2Test {
    private val it: LinkedListCycle2 = LinkedListCycle2()

    @Test
    fun test1() {
//        Input: head = [3,2,0,-4], pos = 1
//        Output: true
//        Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

        val last = ListNode(4)
        val head = ListNode(3, ListNode(2, ListNode(0, last)))
        last.next = head.next

        assertThat(it.detectCycle(head))
            .isSameAs(last.next)
    }

    @Test
    fun test2() {
//        Input: head = [1,2], pos = 0
//        Output: true
//        Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

        val last = ListNode(2)
        val head = ListNode(1, last)
        last.next = head

        assertThat(it.detectCycle(head))
            .isSameAs(last.next)
    }

    @Test
    fun test3() {
//        Input: head = [1], pos = -1
//        Output: false
//        Explanation: There is no cycle in the linked list.

        val head = ListNode(1)

        assertThat(it.detectCycle(head))
            .isNull()
    }
}