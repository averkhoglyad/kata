package com.leetcode;

import com.leetcode.data.ListNode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * <h3><a href="https://leetcode.com/problems/merge-k-sorted-lists/">Merge k Sorted Lists</a></h3>
 * <p>
 *     You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 *     Merge all the linked-lists into one sorted linked-list and return it.
 * </p>
 * 
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>k == lists.length</code></li>
 *         <li><code>0 <= k <= 10^4</code></li>
 *         <li><code>0 <= lists[i].length <= 500</code></li>
 *         <li><code>-10^4 <= lists[i][j] <= 10^4</code></li>
 *         <li><code>lists[i]</code> is sorted in ascending order</li>
 *         <li>The sum of <code>lists[i].length</code> will not exceed 10^4</li>
 *     </ul>
 * </p>
 */
public class MergeSortedLists {

    // Divide and merge
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        var chunkInterval = 1;
        while (chunkInterval < lists.length) {
            for (var i = 0; i < lists.length - chunkInterval; i += chunkInterval * 2) {
                lists[i] = merge(lists[i], lists[i + chunkInterval]);
            }
            chunkInterval = 2 * chunkInterval;
        }

        return lists[0];
    }

    private ListNode merge(ListNode left, ListNode right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        ListNode head = null, current = null;
        while (left != null || right != null) {
            ListNode next;
            if (left == null) {
                next = right;
                right = right.next;
            } else if (right == null) {
                next = left;
                left = left.next;
            } else {
                if (left.val < right.val) {
                    next = left;
                    left = left.next;
                } else {
                    next = right;
                    right = right.next;
                }
            }

            if (current == null) {
                head = next;
                current = next;
            } else {
                current.next = next;
                current = next;
            }
            next.next = null;
        }
        return head;
    }


    // Compare one-by-one
    public ListNode mergeKLists1(ListNode[] lists) {
        if (lists == null) {
            return null;
        }
        ListNode head = null;
        ListNode last = null;

        while (true) {
            int next = -1;
            int lastNotNull = 0;
            for (int i = lists.length - 1; i >= lastNotNull; i--) {
                if (lists[i] == null) {
                    if (lastNotNull == i) {
                        lastNotNull++;
                        continue;
                    }
                    lists[i] = lists[lastNotNull];
                    lists[lastNotNull] = null;
                    lastNotNull++;
                    if (lists[i] == null) {
                        continue;
                    }
                }
                if (next < 0 || lists[i].val < lists[next].val) {
                    next = i;
                }
            }

            if (next < 0) {
                break;
            }
            if (head == null) {
                head = lists[next];
            } else {
                last.next = lists[next];
            }
            last = lists[next];
            lists[next] = lists[next].next;
        }

        return head;
    }

    // Stream based
    public ListNode mergeKLists0(ListNode[] lists) {
        if (lists == null) {
            return null;
        }
        return Arrays.stream(lists)
                .flatMap(head -> Stream.iterate(head, Objects::nonNull, it -> it.next))
                .sorted(Comparator.comparingInt((ListNode it) -> it.val).reversed())
                .reduce(null, (prev, current) -> {
                    current.next = prev;
                    return current;
                });
    }
}
