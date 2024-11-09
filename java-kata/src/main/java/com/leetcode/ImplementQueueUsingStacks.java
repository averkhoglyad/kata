package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <h3><a href="https://leetcode.com/problems/implement-queue-using-stacks/">Implement Queue Using Stacks</a></h3>
 * <p>
 *     Implement a first in first out (FIFO) queue using only two stacks.
 *     The implemented queue should support all the functions of a normal queue
 *     (<code>push</code>, <code>peek</code>, <code>pop</code> and <code>empty</code>).
 * </p>
 * <p>
 *     Implement the <code>MyQueue</code> class:
 *     <ul>
 *         <li><code>void push(int x)</code> Pushes element x to the back of the queue.</li>
 *         <li><code>int pop()</code> Removes the element from the front of the queue and returns it.</li>
 *         <li><code>int peek()</code> Returns the element at the front of the queue.</li>
 *         <li><code>boolean empty()</code> Returns <code>true</code> if the queue is empty, <code>false</code> otherwise.</li>
 *     </ul>
 * </p>
 * <p>
 *     <h6>Notes:</h6>
 *     <ul>
 *         <li>
 *             You must use only standard operations of a stack, which means only <code>push to top</code>,
 *             <code>peek/pop from top</code>, <code>size</code>, and <code>is empty</code> operations are valid.
 *         </li>
 *         <li>Depending on your language, the stack may not be supported natively.
 *         You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
 *         </li>
 *     </ul>
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= x <= 9</code></li>
 *         <li>At most <code>100</code> calls will be made to <code>push</code>, <code>pop</code>, <code>peek</code>, and <code>empty</code>.</li>
 *         <li>All the calls to <code>pop</code> and <code>peek</code> are valid.</li>
 *     </ul>
 * </p>
 * <p>
 *     <strong>Follow-up:</strong>
 *     Can you implement the queue such that each operation is <a href="https://en.wikipedia.org/wiki/Amortized_analysis">amortized</a> <code>O(1)</code> time complexity?
 *     In other words, performing n operations will take overall <code>O(n)</code> time even if one of those operations may take longer.
 * </p>
 */
public class ImplementQueueUsingStacks {

    private final Deque<Integer> lifo = new ArrayDeque<>();
    private final Deque<Integer> fifo = new ArrayDeque<>();

    public void push(int x) {
        lifo.push(x);
    }

    public int pop() {
        if (fifo.isEmpty()) {
            move(lifo, fifo);
        }
        return fifo.pop();
    }

    public int peek() {
        if (fifo.isEmpty()) {
            move(lifo, fifo);
        }
        return fifo.peek();
    }

    public boolean empty() {
        return lifo.isEmpty() && fifo.isEmpty();
    }

    private void move(Deque<Integer> src, Deque<Integer> dest) {
        while(!src.isEmpty()) {
            dest.push(src.pop());
        }
    }
}
