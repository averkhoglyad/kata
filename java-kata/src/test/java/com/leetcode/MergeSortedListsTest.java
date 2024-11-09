package com.leetcode;

import com.leetcode.data.ListNode;
import org.junit.jupiter.api.Test;

import static com.leetcode.data.ListNode.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class MergeSortedListsTest {

    final MergeSortedLists it = new MergeSortedLists();

    @Test
    void test1() {
        var source = new ListNode[]{
                listOf(1, 4, 5),
                listOf(1, 3, 4),
                listOf(2, 6)
        };
        assertThat(it.mergeKLists(source))
                .isEqualTo(listOf(1, 1, 2, 3, 4, 4, 5, 6));
    }

    @Test
    void test2() {
        var source = new ListNode[]{};
        assertThat(it.mergeKLists(source))
                .isNull();
    }

    @Test
    void test3() {
        var source = new ListNode[]{listOf()};
        assertThat(it.mergeKLists(source))
                .isNull();
    }

}