package com.leetcode;

import com.leetcode.data.ListNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.leetcode.data.ListNode.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists it = new MergeTwoSortedLists();

    @Test
    void test0() {
        assertThat(asList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(0)))))))
                .containsExactly(1, 2, 3, 4, 0);
        assertThat(asList(listOf(1, 2, 3, 4)))
                .containsExactly(1, 2, 3, 4);
    }

    @Test
    void test1() {
        assertThat(asList(it.mergeTwoLists(listOf(1, 2, 4), listOf(1, 3, 4))))
                .containsExactly(1, 1, 2, 3, 4, 4);
    }

    @Test
    void test2() {
        assertThat(it.mergeTwoLists(null, null))
                .isNull();
    }

    @Test
    void test3() {
        assertThat(asList(it.mergeTwoLists(listOf(), listOf(1))))
                .containsExactly(1);
    }

    private List<Integer> asList(ListNode head) {
        var res = new ArrayList<Integer>();
        for (var node = head; node != null; node = node.next) {
            res.add(node.val);
        }
        return res;
    }
}