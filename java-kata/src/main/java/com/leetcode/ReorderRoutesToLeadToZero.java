package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <h3><a href="https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/">Reorder Routes to Make All Paths Lead to the City Zero</a></h3>
 *
 * <p>
 * There are n cities numbered from 0 to n - 1 and n - 1 roads such that there is only one way to travel
 * between two different cities (this network form a tree). Last year, The ministry of transport decided to orient
 * the roads in one direction because they are too narrow. Roads are represented by connections
 * where connections[i] = [ai, bi] represents a road from city ai to city bi.
 * This year, there will be a big event in the capital (city 0), and many people want to travel to this city.
 * Your task consists of reorienting some roads such that each city can visit the city 0.
 * Return the minimum number of edges changed.
 * It's guaranteed that each city can reach city 0 after reorder.
 * </p>
 * <h6>Constraints:</h6>
 * <ul>
 *     <li><code>2 <= n <= 5 * 10^4</code></li>
 *     <li><code>connections.length == n - 1</code></li>
 *     <li><code>connections[i].length == 2</code></li>
 *     <li><code>0 <= ai, bi <= n - 1</code></li>
 *     <li><code>ai != bi</code></li>
 * </ul>
 * </p>
 */
public class ReorderRoutesToLeadToZero {

    // Streams
    public int minReorder(int n, int[][] connections) {
        record Child(int n, int cost) {}

        var map = new HashMap<Integer, List<Child>>();
        for (var con : connections) {
            map.computeIfAbsent(con[0], __ -> new ArrayList<>())
                    .add(new Child(con[1], 1));
            map.computeIfAbsent(con[1], __ -> new ArrayList<>())
                    .add(new Child(con[0], 0));
        }

        var processed = new boolean[n];
        var inProgress = new ArrayList<Integer>();
        inProgress.add(0);
        var totalCost = new AtomicInteger();
        while (inProgress.size() > 0) {
            var next = new ArrayList<Integer>();
            inProgress.stream()
                    .peek(it -> processed[it] = true)
                    .map(map::get)
                    .flatMap(List::stream)
                    .filter(it -> !processed[it.n])
                    .peek(it -> next.add(it.n))
                    .forEach(it -> totalCost.addAndGet(it.cost));
            inProgress = next;
        }
        return totalCost.get();
    }

    // Less memory
    public int minReorder0(int n, int[][] connections) {
        record Child(int n, int cost) {}

        var map = new HashMap<Integer, List<Child>>();
        for (var con : connections) {
            map.computeIfAbsent(con[0], __ -> new ArrayList<>())
                    .add(new Child(con[1], 1));
            map.computeIfAbsent(con[1], __ -> new ArrayList<>()).add(new Child(con[0], 0));
        }

        var processed = new boolean[n];
        var inProgress = new ArrayList<Integer>();
        inProgress.add(0);
        var totalCost = 0;
        while (inProgress.size() > 0) {
            var next = new ArrayList<Integer>();
            for (var city : inProgress) {
                var children = map.get(city);
                for (var child : children) {
                    if (processed[child.n]) {
                        continue;
                    }
                    next.add(child.n);
                    totalCost += child.cost;
                }
                processed[city] = true;
            }
            inProgress = next;
        }
        return totalCost;
    }

    // Faster
    public int minReorder1(int n, int[][] connections) {
        var nodes = new List[n];
        for (var con : connections) {
            nodes[con[0]] = nodes[con[0]] != null ? nodes[con[0]] : new ArrayList<int[]>();
            nodes[con[1]] = nodes[con[1]] != null ? nodes[con[1]] : new ArrayList<int[]>();
            nodes[con[0]].add(new int[]{con[1], 1});
            nodes[con[1]].add(new int[]{con[0], 0});
        }

        var processed = new boolean[n];
        var inProgress = new ArrayList<Integer>();
        inProgress.add(0);
        var totalCost = 0;
        while (inProgress.size() > 0) {
            var next = new ArrayList<Integer>();
            for (var city : inProgress) {
                List<int[]> children = nodes[city];
                for (var child : children) {
                    if (processed[child[0]]) {
                        continue;
                    }
                    next.add(child[0]);
                    totalCost += child[1];
                }
                processed[city] = true;
            }
            inProgress = next;
        }
        return totalCost;
    }
}
