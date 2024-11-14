package com.leetcode;

import java.util.*;

import static java.util.stream.Collectors.joining;

/**
 * <h3><a href="https://leetcode.com/problems/clone-graph/">Clone Graph</a></h3>
 * <p>
 *     Given a reference of a node in a <a href="https://en.wikipedia.org/wiki/Connectivity_(graph_theory)#Connected_graph">connected</a> undirected graph.
 * </p>
 * <p>
 *     Return a <a href="https://en.wikipedia.org/wiki/Object_copying#Deep_copy">deep copy</a> (clone) of the graph.
 * </p>
 * <p>
 *     Each node in the graph contains a value (<code>int</code>) and a list (<code>List[Node]</code>) of its neighbors.
 * </p>
 * <pre><code>
 *     class Node {
 *         public int val;
 *         public List<Node> neighbors;
 *     }
 * </code></pre>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li>The number of nodes in the graph is in the range <code>[0, 100]</code>.</li>
 *         <li><code>1 <= Node.val <= 100</code></li>
 *         <li><code>Node.val</code> is unique for each node.</li>
 *         <li>There are no repeated edges and no self-loops in the graph.</li>
 *         <li>The Graph is connected and all nodes can be visited starting from the given node.</li>
 *     </ul>
 * </p>
 */
public class CloneGraph {

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        var cache = new Node[100];
        cache[node.val - 1] = new Node(node.val);

        var stack = new LinkedList<Node>();
        stack.push(node);

        while (!stack.isEmpty()) {
            var current = stack.pop();
            var copy = cache[current.val - 1];
            for (var it : current.neighbors) {
                if (cache[it.val - 1] == null) {
                    cache[it.val - 1] = new Node(it.val);
                    stack.push(it);
                }
                copy.neighbors.add(cache[it.val - 1]);
            }
        }
        return cache[0];
    }

    public Node cloneGraph0(Node node) {
        if (node == null) {
            return null;
        }
        return copy(node, new Node[100]);
    }

    private Node copy(Node node, Node[] cache) {
        if (cache[node.val - 1] != null) {
            return cache[node.val - 1];
        }
        var copied = new Node(node.val, new ArrayList<>(node.neighbors.size()));
        cache[node.val - 1] = copied;
        for (var it : node.neighbors) {
            copied.neighbors.add(copy(it, cache));
        }
        return copied;
    }

    public static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }

        /////

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            var node = (Node) o;
            return val == node.val &&
                    Objects.equals(
                            neighbors.stream().map(it -> it.val).toList(),
                            node.neighbors.stream().map(it -> it.val).toList()
                    );
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, neighbors.stream().map(it -> it.val).toList());
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", neighbors=" + neighbors.stream().map(it -> Integer.toString(it.val)).collect(joining(", ", "[", "]")) +
                    '}';
        }
    }
}
