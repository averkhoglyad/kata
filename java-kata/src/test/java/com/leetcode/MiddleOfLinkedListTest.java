package com.leetcode;

import com.leetcode.data.ListNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.list;

class MiddleOfLinkedListTest {

    private final MiddleOfLinkedList it = new MiddleOfLinkedList();

    @Test
    void test1() {
//        Input: head = [1,2,3,4,5]
//        Output: [3,4,5]
//        Explanation: The middle node of the list is node 3.

        var input = ListNode.listOf(1, 2, 3, 4, 5);
        var expected = List.of(3, 4, 5);
        assertThat(it.middleNode(input))
                .extracting(ListNode::toList, list(Integer.class))
                .containsExactlyElementsOf(expected);
    }

    @Test
    void test2() {
//        Input: head = [1,2,3,4,5,6]
//        Output: [4,5,6]
//        Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

        var input = ListNode.listOf(1, 2, 3, 4, 5, 6);
        var expected = List.of(4, 5, 6);
        assertThat(it.middleNode(input))
                .extracting(ListNode::toList, list(Integer.class))
                .containsExactlyElementsOf(expected);
    }
}