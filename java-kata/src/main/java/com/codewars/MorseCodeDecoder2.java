package com.codewars;

import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class MorseCodeDecoder2 {

    public static String decodeBits(String bits) {
        bits = bits.replaceAll("(^0+|0+$)", "");
        final int dotSize = detectUnitSize(bits);
        final int dashSize = dotSize * 3;
        final int spaceSize = dotSize * 7;

        final String result = bits
                .replaceAll("1{" + dashSize + "}", "-")
                .replaceAll("1{" + dotSize + "}", ".")
                .replaceAll("0{" + spaceSize + "}", "   ")
                .replaceAll("0{" + dashSize + "}", " ")
                .replaceAll("0+", "");
        return result;
    }

    private static int detectUnitSize(String bits) {
        final int signalMinSizeSize = stream(bits.split("0+"))
                .filter(it -> it != null && it.length() > 0)
                .mapToInt(String::length)
                .min()
                .orElse(Integer.MAX_VALUE);
        final int pauseMinSizeSize = stream(bits.split("1+"))
                .filter(it -> it != null && it.length() > 0)
                .mapToInt(String::length)
                .min()
                .orElse(Integer.MAX_VALUE);
        return Math.min(signalMinSizeSize, pauseMinSizeSize);
    }

    public static String decodeMorse(String morseCode) {
        return stream(morseCode.split("\\s{3}"))
                .map(it -> decodeWord(it))
                .collect(Collectors.joining(" "));
    }

    private static String decodeWord(String morseCode) {
        return stream(morseCode.split("\\s"))
                .map(it -> MorseCode.get(it))
                .filter(it -> it != null && it.length() > 0)
                .collect(Collectors.joining());
    }

    // provided
    public static class MorseCode {
        public static String get(String it) {
            return it;
        }
    }
}
