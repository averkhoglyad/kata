package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3><a href="https://leetcode.com/problems/lru-cache/">LRU Cache</a></h3>
 * <p>
 *     Design a data structure that follows the constraints of
 *     a <a href="https://en.wikipedia.org/wiki/Cache_replacement_policies#LRU">Least Recently Used (LRU) cache</a>.
 * </p>
 * <p>
 *     Implement the <code>LRUCache</code> class:
 *     <ul>
 *         <li><code>LRUCache(int capacity)</code> Initialize the LRU cache with positive size <code>capacity</code></li>
 *         <li><code>int get(int key)</code> Return the value of the <code>key</code> if the key exists, otherwise return <code>-1</code></li>
 *         <li>
 *             <code>void put(int key, int value)</code> Update the value of the <code>key</code> if the <code>key</code> exists.
 *             Otherwise, add the <code>key-value</code> pair to the cache.
 *             If the number of keys exceeds the <code>capacity</code> from this operation, evict the least recently used key
 *         </li>
 *     </ul>
 * </p>
 * <p>
 *     The functions get and put must each run in O(1) average time complexity.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= capacity <= 3000</code></li>
 *         <li><code>0 <= key <= 10^4</code></li>
 *         <li><code>0 <= value <= 10^5</code></li>
 *         <li>At most <code>2 * 10^5</code> calls will be made to get and put.</li>
 *     </ul>
 * </p>
 */
public class LRUCache {

    private final Map<Integer, Entry> map;

    private final int capacity;

    private Entry head = null;
    private Entry tail = null;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>(capacity);
    }

    public int get(int key) {
        var entry = map.get(key);
        if (entry == null) {
            return -1;
        }
        moveTop(entry);
        return entry.value;
    }

    public void put(int key, int value) {
        var entry = map.get(key);
        if (entry != null) {
            entry.value = value;
        } else {
            entry = new Entry(key, value);
        }
        moveTop(entry);
        map.put(key, entry);
        if (map.size() > capacity) {
            remove(tail.key);
        }
    }

    private void moveTop(Entry entry) {
        removeEntryFromQueue(entry);
        if (head == null) {
            head = entry;
            tail = entry;
        }
        if (head == entry) {
            return;
        }
        entry.prev = null;
        entry.next = head;
        head.prev = entry;
        head = entry;
    }

    private void remove(int key) {
        var entry = map.remove(key);
        if (entry == null) {
            return;
        }
        removeEntryFromQueue(entry);
        map.remove(entry.key);
    }

    private void removeEntryFromQueue(Entry entry) {
        if (entry == head) {
            head = entry.next;
        }
        if (entry == tail) {
            tail = entry.prev;
        }

        if (entry.prev != null) {
            entry.prev.next = entry.next;
        }
        if (entry.next != null) {
            entry.next.prev = entry.prev;
        }
    }

    private static class Entry {

        final int key;

        int value;

        Entry prev;
        Entry next;

        private Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
