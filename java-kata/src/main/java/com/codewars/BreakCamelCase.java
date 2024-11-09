package com.codewars;

public class BreakCamelCase {
    public static String camelCase(String input) {
        var sb = new StringBuilder();
        for (int cp : (Iterable<Integer>) input.codePoints()::iterator) {
            if (Character.isUpperCase(cp) && sb.length() > 0) {
                sb.append(" ");
            }
            sb.appendCodePoint(cp);
        }
        return sb.toString();
    }
}
