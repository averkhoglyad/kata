package ru.yandex;

import com.leetcode.SlidingWindowMaximum;
import org.junit.jupiter.api.Test;
import ru.yandex.Travel.Point;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class TravelTest {

    @Test
    void test0() {
        List<Point> cities = List.of(
                new Point(0, 0),
                new Point(0, 2),
                new Point(2, 2),
                new Point(0, -2),
                new Point(2, -2),
                new Point(2, -1),
                new Point(2, 1)
        );
        assertThat(Travel.countWays(cities, 1, 3, 2))
                .isEqualTo(2);
    }

    @Test
    void test1() {
        List<Point> cities = List.of(
                new Point(0, 0),
                new Point(1, 0),
                new Point(0, 1),
                new Point(1, 1)
        );
        assertThat(Travel.countWays(cities, 1, 4, 2))
                .isEqualTo(1);
    }

    @Test
    void test2() {
        List<Point> cities = List.of(
                new Point(0, 0),
                new Point(2, 0),
                new Point(0, 2),
                new Point(2, 2)
        );
        assertThat(Travel.countWays(cities, 1, 4, 1))
                .isEqualTo(-1);
    }
}