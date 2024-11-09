package com.leetcode;

import com.leetcode.data.ListNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseLinkedListTest {

    private final ReverseLinkedList it = new ReverseLinkedList();

    @Test
    void test1() {
//        Input: head = [1,2,3,4,5]
//        Output: [5,4,3,2,1]

        var input = ListNode.listOf(1, 2, 3, 4, 5);
        var expected = List.of(5, 4, 3, 2, 1);
        var result = it.reverseList(input);

        assertThat(result.toList())
                .containsExactlyElementsOf(expected);
    }

    @Test
    void test2() {
//        Input: head = [1,2]
//        Output: [2,1]

        var input = ListNode.listOf(1, 2);
        var expected = List.of(2, 1);
        var result = it.reverseList(input);

        assertThat(result.toList())
                .containsExactlyElementsOf(expected);
    }

    @Test
    void test3() {
//        Input: head = []
//        Output: []

        assertThat(it.reverseList(null))
                .isNull();
    }
}