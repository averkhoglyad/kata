package com.leetcode.data

import java.util.Objects
import java.util.function.Predicate
import java.util.function.UnaryOperator
import java.util.stream.Stream

data class ListNode(var `val`: Int = 0,
                    var next: ListNode? = null)

fun listNodesOf(vararg nums: Int): ListNode? {
    if (nums.isEmpty()) {
        return null
    }
    var root: ListNode? = null
    for (i in nums.indices.reversed()) {
        root = ListNode(nums[i], root)
    }
    return root
}

fun ListNode?.toList(): List<Int> {
    if (this == null) {
        emptyList<Int>()
    }

    var seq = sequence {
        var node = this@toList
        while (node != null) {
            yield(node.`val`)
            node = node.next
        }
    }
    return seq.toList()
}
