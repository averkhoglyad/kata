package com.leetcode;

import com.leetcode.data.ListNode;
import org.junit.jupiter.api.Test;

import static com.leetcode.data.ListNode.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class RemoveNodeFromEndOfLinkedListTest {

    final RemoveNodeFromEndOfLinkedList it = new RemoveNodeFromEndOfLinkedList();

    @Test
    void test1() {
        assertThat(it.removeNthFromEnd(listOf(1, 2, 3, 4, 5), 2))
                .extracting(ListNode::toList)
                .asList()
                .containsExactly(1,2,3,5);
    }

    @Test
    void test2() {
        assertThat(it.removeNthFromEnd(listOf(1), 1))
                .isNull();
    }

    @Test
    void test3() {
        assertThat(it.removeNthFromEnd(listOf(1, 2), 1))
                .extracting(ListNode::toList)
                .asList()
                .containsExactly(1);
    }
}