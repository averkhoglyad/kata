package ru.yandex;

import java.io.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

import static java.util.function.Predicate.not;

public class Travel {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        var citiesCount = Integer.parseInt(reader.readLine());
        var cities = new ArrayList<Point>();
        for (int i = 0; i < citiesCount; i++) {
            int[] ints = readTwoInts();
            cities.add(new Point(ints[0], ints[1]));
        }

        var limit = Integer.parseInt(reader.readLine());
        var requiredCities = readTwoInts();

        System.out.println(countWays(cities, requiredCities[0], requiredCities[1], limit));
    }

    static int countWays(List<Point> cities, int startNum, int finishNum, int limit) {
        var start = cities.get(startNum - 1);
        var finish = cities.get(finishNum - 1);

        var citiesTable = new HashMap<Point, Integer>();
        citiesTable.put(start, 0);

        var neighbors = Collections.singletonList(start);
        while (neighbors.size() > 0) {
            var next = new ArrayList<Point>();
            for (var current : neighbors) {
                var currentWay = citiesTable.get(current);
                var finished = cities.stream()
                        .filter(it -> it != current)
                        .filter(not(citiesTable::containsKey))
                        .filter(it -> current.path(it) <= limit)
                        .peek(next::add)
                        .peek(it -> citiesTable.put(it, currentWay + 1))
                        .anyMatch(it -> it == finish);
                if (finished) {
                    return citiesTable.get(finish);
                }
            }
            neighbors = next;
        }
        return -1;
    }

    private static int[] readTwoInts() throws IOException {
        String s = reader.readLine();
        String[] ints = s.split(" ");
        return new int[]{Integer.parseInt(ints[0]), Integer.parseInt(ints[1])};
    }

    static final class Point {
        private final int x;
        private final int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int path(Point other) {
            return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
        }
    }
}
