package com.leetcode

import java.util.ArrayList
import java.util.LinkedList
import java.util.Objects

/**
 * ### [Clone Graph](https://leetcode.com/problems/clone-graph/)
 *
 * Given a reference of a node in a [connected](https://en.wikipedia.org/wiki/Connectivity_(graph_theory)#Connected_graph) undirected graph.
 *
 * Return a [deep copy](https://en.wikipedia.org/wiki/Object_copying#Deep_copy) (clone) of the graph.
 *
 * Each node in the graph contains a value (`int`) and a list (`List[Node]`) of its neighbors.
 *
 * ```kotlin
 * class Node(var `val`: Int) {
 *     var neighbors: ArrayList<Node> = ArrayList<Node>()
 * }
 * ```
 *
 * ###### Constraints:
 *  - The number of nodes in the graph is in the range `[0, 100]`.
 *  - `1 <= Node.val <= 100`
 *  - `Node.val` is unique for each node.
 *  - There are no repeated edges and no self-loops in the graph.
 *  - The Graph is connected and all nodes can be visited starting from the given node.
 */
class CloneGraph {

    fun cloneGraph(node: Node?): Node? {
        if (node == null) return null

        val cache = arrayOfNulls<Node?>(100)
        cache[node.`val` - 1] = Node(node.`val`)

        val stack = LinkedList<Node>()
        stack.add(node)

        while (stack.isNotEmpty()) {
            val current = stack.pop()
            val copied = cache[current.`val` - 1]!!

            for (it in current.neighbors) {
                if (it == null) continue
                if (cache[it.`val` - 1] == null) {
                    cache[it.`val` - 1] = Node(it.`val`)
                    stack.add(it)
                }
                copied.neighbors.add(cache[it.`val` - 1])
            }
        }

        return cache[node.`val` - 1]
    }

    fun cloneGraph0(node: Node?): Node? {
        if (node == null) return null
        val cache = arrayOfNulls<Node?>(100)
        return copy(node, cache)
    }

    private fun copy(node: Node, cache: Array<Node?>): Node {
        var copied = cache[node.`val` - 1]
        if (copied != null) {
            return copied
        }
        copied = Node(node.`val`)
        cache[node.`val` - 1] = copied
        for (it in node.neighbors) {
            copied.neighbors.add(it?.let { copy(it, cache) })
        }
        return copied
    }

    class Node(val `val`: Int) {

        val neighbors: ArrayList<Node?> = ArrayList<Node?>()

        /////
        override fun equals(o: Any?): Boolean {
            if (this === o) return true
            if (o == null || this::class != o::class) return false
            val node = o as Node
            return `val` == node.`val` && neighbors.map { it?.`val` } == node.neighbors.map { it?.`val` }
        }

        override fun hashCode(): Int {
            return Objects.hash(`val`, neighbors.map { it?.`val` })
        }

        override fun toString(): String {
            return "Node{" +
                    "val=" + `val` +
                    ", neighbors=" + neighbors.map { it?.`val` }.joinToString(", ", "[", "]") +
                    '}'
        }
    }
}
