package com.codewars;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class ThreadedCounting {

    public static void countInThreads(Counter counter) {
        var phase = new AtomicInteger(1);
        IntConsumer handle = it -> {
            while (phase.get() < it) {
            }
            counter.count(it);
            phase.incrementAndGet();
        };
        var trs = new Thread[]{
                new Thread(() -> IntStream.rangeClosed(1, 100).filter(i -> i % 3 == 0)
                        .forEachOrdered(handle)
                ),
                new Thread(() -> IntStream.rangeClosed(1, 100).filter(i -> i % 3 == 1)
                        .forEachOrdered(handle)
                ),
                new Thread(() -> IntStream.rangeClosed(1, 100).filter(i -> i % 3 == 2)
                        .forEachOrdered(handle)
                ),
        };

        for (Thread tr : trs) {
            tr.start();
        }
        try {
            for (Thread tr : trs) {
                tr.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface Counter {
        void count(int i);
    }
}
