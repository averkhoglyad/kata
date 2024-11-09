package com.leetcode

import com.leetcode.data.ListNode
import com.leetcode.data.listNodesOf
import com.leetcode.data.toList
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import test.list

internal class MergeTwoSortedListsTest {

    private val it = MergeTwoSortedLists()

    @Test
    fun test1() {
        assertThat<ListNode?>(it.mergeTwoLists(listNodesOf(1, 2, 4), listNodesOf(1, 3, 4)))
            .extracting(ListNode::toList, list<Int>())
            .containsExactly(1, 1, 2, 3, 4, 4)
    }

    @Test
    fun test2() {
        assertThat(it.mergeTwoLists(null, null))
            .isNull()
    }

    @Test
    fun test3() {
        assertThat<ListNode?>(it.mergeTwoLists(listNodesOf(), listNodesOf(1)))
            .extracting(ListNode::toList, list<Int>())
            .containsExactly(1)
    }
}