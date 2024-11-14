package com.leetcode;

import com.leetcode.CloneGraph.Node;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CloneGraphTest {

    private final CloneGraph target = new CloneGraph();

    @Test
    void test1() {
//        Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
//        Output: [[2,4],[1,3],[2,4],[1,3]]
//        Explanation: There are 4 nodes in the graph.
//        1st node (val = 1)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
//        2nd node (val = 2)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
//        3rd node (val = 3)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
//        4th node (val = 4)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).

        var n1 = new Node(1);
        var n2 = new Node(2);
        var n3 = new Node(3);
        var n4 = new Node(4);

        n1.neighbors.add(n2);
        n1.neighbors.add(n4);

        n2.neighbors.add(n1);
        n2.neighbors.add(n3);

        n3.neighbors.add(n2);
        n3.neighbors.add(n4);

        n4.neighbors.add(n1);
        n4.neighbors.add(n3);

        var r1 = target.cloneGraph(n1);

        assertThat(r1)
                .isNotSameAs(n1)
                .isEqualTo(n1);

        var r2 = r1.neighbors.get(0);
        var r4 = r1.neighbors.get(1);

        assertThat(r2)
                .isNotSameAs(n2)
                .isEqualTo(n2);

        assertThat(r4)
                .isNotSameAs(n4)
                .isEqualTo(n4);

        var r3 = r2.neighbors.get(1);
        assertThat(r3)
                .isNotSameAs(n3)
                .isEqualTo(n3);
    }

    @Test
    void test2() {
//        Input: adjList = [[]]
//        Output: [[]]
//        Explanation: Note that the input contains one empty list. The graph consists of only one node with val = 1 and it does not have any neighbors.

        var n1 = new Node(1);

        assertThat(target.cloneGraph(n1))
                .isNotSameAs(n1)
                .isEqualTo(n1);
    }

    @Test
    void test3() {
//        Input: adjList = []
//        Output: []
//        Explanation: This an empty graph, it does not have any nodes.

        assertThat(target.cloneGraph(null))
                .isNull();
    }
}