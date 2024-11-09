package io.averkhoglyad.kata;

import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class GenerateByTemplate {

    public List<String> generateList(String tpl) {
        return generate(tpl).toList();
    }

    public Stream<String> generate(String tpl) {
        if (tpl.indexOf('?') < 0) {
            return Stream.of(tpl);
        }
        return Stream.generate(stringByTemplate(tpl))
                .takeWhile(Objects::nonNull);
    }

    // Returns generated string or null on finish
    private Supplier<String> stringByTemplate(String tpl) {
        var chars = tpl.toCharArray();
        var wildcardIndexes = detectWildcardIndexes(chars);
        var bitSetRef = new AtomicReference<>(new BitSet(wildcardIndexes.length));

        return () -> {
            var bitSet = bitSetRef.get();
            if (bitSet == null) return null;
            var generatedValue = generateResultString(chars, wildcardIndexes, bitSet);
            bitSetRef.set(mutate(bitSet, wildcardIndexes.length));
            return generatedValue;
        };
    }

    // Finds all wildcards and returns mapping wildcard number to its position in the template string
    private int[] detectWildcardIndexes(char[] chars) {
        var count = 0;
        for (char it : chars) {
            if (it == '?') {
                count++;
            }
        }
        var result = new int[count];
        var pos = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                result[pos++] = i;
            }
        }
        return result;
    }

    // Mutates bitset to inc value, returns null on overwhelming
    private BitSet mutate(BitSet bitSet, int size) {
        var i = 0;
        while (i < size && bitSet.get(i)) {
            i++;
        }

        if (i == size) {
            return null;
        }

        bitSet.set(0, i, false);
        bitSet.set(i, true);
        return bitSet;
    }

    private String generateResultString(char[] chars, int[] wildcards, BitSet bitSet) {
        for (var i = wildcards.length - 1; i >= 0; i--) {
            chars[wildcards[i]] = bitSet.get(i) ? '1' : '0';
        }
        return new String(chars);
    }
}
