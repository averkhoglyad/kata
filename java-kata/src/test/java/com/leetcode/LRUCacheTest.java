package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LRUCacheTest {

    @Test
    void test0() {
        var it = new LRUCache(2);
        it.put(1, 1);
        it.put(2, 2);
        assertThat(it.get(1)).isEqualTo(1);
        it.put(3, 3);
        assertThat(it.get(2)).isEqualTo(-1);
        it.put(4, 4);
        assertThat(it.get(1)).isEqualTo(-1);
        assertThat(it.get(3)).isEqualTo(3);
        assertThat(it.get(4)).isEqualTo(4);
    }

    @Test
    void test1() {
        var it = new LRUCache(3);

        it.put(1, 1);
        it.put(2, 2);
        it.put(3, 3);
        it.put(4, 4);

        assertThat(it.get(4)).isEqualTo(4);
        assertThat(it.get(3)).isEqualTo(3);
        assertThat(it.get(2)).isEqualTo(2);
        assertThat(it.get(1)).isEqualTo(-1);

        it.put(5, 5);

        assertThat(it.get(1)).isEqualTo(-1);
        assertThat(it.get(2)).isEqualTo(2);
        assertThat(it.get(3)).isEqualTo(3);
        assertThat(it.get(4)).isEqualTo(-1);
        assertThat(it.get(5)).isEqualTo(5);
    }

    @Test
    void test2() {
        var it = new LRUCache(2);
        assertThat(it.get(2)).isEqualTo(-1);
        it.put(2, 6);
        assertThat(it.get(1)).isEqualTo(-1);
        it.put(1, 5);
        it.put(1, 2);
        assertThat(it.get(1)).isEqualTo(2);
        assertThat(it.get(2)).isEqualTo(6);
    }
}