package ru.yandex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Braces {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        var count = Integer.parseInt(reader.readLine());
        if (count == 0) {
            return;
        }

        int[] pos = IntStream.range(0, count).toArray();

        while (true) {
            for (var i = count - 1; i >= 0; i--) {
                if (i == 0) {
                    return;
                }
                var maxNum = i * 2 - 1;
                if (pos[i] <= maxNum) {
                    var value = pos[i] + 1;
                    for (var j = i; j < count; j++) {
                        pos[j] = value++;
                    }
                    break;
                }
            }
        }
    }

    private static String str(int[] pos) {
        var chars = new char[pos.length * 2];
        Arrays.fill(chars, ')');
        for (int p : pos) {
            chars[p] = '(';
        }
        return new String(chars);
    }

}
