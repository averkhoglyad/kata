package com.leetcode.data;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class ListNode {
    
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /////

    public static ListNode listOf(int... nums) {
        if (nums.length == 0) {
            return null;
        }
        ListNode root = null;
        for (int i = nums.length - 1; i >= 0; i--) {
            root = new ListNode(nums[i], root);
        }
        return root;
    }

    public List<Integer> toList() {
        return Stream.iterate(this, Objects::nonNull, it -> it.next)
                .map(it -> it.val)
                .toList();

    }

    /////

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        var listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + (next != null ? next.val : null) +
                '}';
    }
}
