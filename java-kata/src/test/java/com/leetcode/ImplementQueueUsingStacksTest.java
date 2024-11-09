package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ImplementQueueUsingStacksTest {

    private final ImplementQueueUsingStacks it = new ImplementQueueUsingStacks();

    @Test
    void test1() {
        it.push(1); // queue is: [1]
        it.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        assertThat(it.peek())
                .isEqualTo(1); // return 1
        assertThat(it.pop())
                .isEqualTo(1); // return 1, queue is [2]
        assertThat(it.empty())
                .isFalse(); // return false
        assertThat(it.pop())
                .isEqualTo(2); // return 1, queue is []
        assertThat(it.empty())
                .isTrue(); // return true
    }

}