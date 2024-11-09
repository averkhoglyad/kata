package com.leetcode

import com.leetcode.data.ListNode
import com.leetcode.data.listNodesOf
import com.leetcode.data.toList
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.ObjectAssert
import org.junit.jupiter.api.Test
import test.list

internal class ReverseLinkedListTest {
    
    private val it = ReverseLinkedList()

    @Test
    fun test1() {
//        Input: head = [1,2,3,4,5]
//        Output: [5,4,3,2,1]

        val input: ListNode? = listNodesOf(1, 2, 3, 4, 5)
        val expected = arrayOf(5, 4, 3, 2, 1)

        assertThat(it.reverseList(input))
            .extracting(ListNode?::toList, list<Int>())
            .containsExactly(*expected)
    }

    @Test
    fun test2() {
//        Input: head = [1,2]
//        Output: [2,1]

        val input: ListNode? = listNodesOf(1, 2)
        val expected = arrayOf(2, 1)

        assertThat(it.reverseList(input))
            .extracting(ListNode?::toList, list<Int>())
            .containsExactly(*expected)
    }

    @Test
    fun test3() {
//        Input: head = []
//        Output: []

        assertThat(it.reverseList(null))
            .isNull()
    }
}