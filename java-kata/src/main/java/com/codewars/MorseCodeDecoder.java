package com.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseCodeDecoder {

    public static String decode(String morseCode) {
        return Arrays.stream(morseCode.trim().split("   "))
                .map(it -> decodeWorld(it))
                .collect(Collectors.joining(" "));
    }

    private static String decodeWorld(String morseCode) {
        return Arrays.stream(morseCode.split(" "))
                .map(it -> MorseCode.get(it))
                .filter(it -> it != null)
                .collect(Collectors.joining());
    }

    // provided
    public static class MorseCode {
        static final Map<String, String> MORSE_CODE = new HashMap<>();
        static {
                MORSE_CODE.put(".-", "A");
                MORSE_CODE.put("-...", "B");
                MORSE_CODE.put("-.-.", "C");
                MORSE_CODE.put("-..", "D");
                MORSE_CODE.put(".", "E");
                MORSE_CODE.put("..-.", "F");
                MORSE_CODE.put("--.", "G");
                MORSE_CODE.put("....", "H");
                MORSE_CODE.put("..", "I");
                MORSE_CODE.put(".---", "J");
                MORSE_CODE.put("-.-", "K");
                MORSE_CODE.put(".-..", "L");
                MORSE_CODE.put("--", "M");
                MORSE_CODE.put("-.", "N");
                MORSE_CODE.put("---", "O");
                MORSE_CODE.put(".--.", "P");
                MORSE_CODE.put("--.-", "Q");
                MORSE_CODE.put(".-.", "R");
                MORSE_CODE.put("...", "S");
                MORSE_CODE.put("-", "T");
                MORSE_CODE.put("..-", "U");
                MORSE_CODE.put("...-", "V");
                MORSE_CODE.put(".--", "W");
                MORSE_CODE.put("-..-", "X");
                MORSE_CODE.put("-.--", "Y");
                MORSE_CODE.put("--..", "Z");
                MORSE_CODE.put(".----", "1");
                MORSE_CODE.put("..---", "2");
                MORSE_CODE.put("...--", "3");
                MORSE_CODE.put("....-", "4");
                MORSE_CODE.put(".....", "5");
                MORSE_CODE.put("-....", "6");
                MORSE_CODE.put("--...", "7");
                MORSE_CODE.put("---..", "8");
                MORSE_CODE.put("----.", "9");
                MORSE_CODE.put("-----", "0");
                MORSE_CODE.put("--..--", ", ");
                MORSE_CODE.put(".-.-.-", ".");
                MORSE_CODE.put("..--..", "?");
                MORSE_CODE.put("-..-.", "/");
                MORSE_CODE.put("-....-", "-");
                MORSE_CODE.put("-.--.", "(");
                MORSE_CODE.put("-.--.-", ")");
        }
        public static String get(String it) {
            return MORSE_CODE.get(it);
        }
    }
}
