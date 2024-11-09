package com.leetcode

import com.leetcode.data.ListNode
import com.leetcode.data.listNodesOf
import com.leetcode.data.toList
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import test.list

internal class MiddleOfLinkedListTest {

    private val it = MiddleOfLinkedList()

    @Test
    fun test1() {
//        Input: head = [1,2,3,4,5]
//        Output: [3,4,5]
//        Explanation: The middle node of the list is node 3.

        val input = listNodesOf(1, 2, 3, 4, 5)
        val expected = arrayOf(3, 4, 5)
        assertThat(it.middleNode(input))
            .extracting(ListNode?::toList, list<Int>())
            .containsExactly(*expected)
    }

    @Test
    fun test2() {
//        Input: head = [1,2,3,4,5,6]
//        Output: [4,5,6]
//        Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

        val input = listNodesOf(1, 2, 3, 4, 5, 6)
        val expected = arrayOf(4, 5, 6)
        assertThat(it.middleNode(input))
            .extracting(ListNode?::toList, list<Int>())
            .containsExactly(*expected)
    }
}
