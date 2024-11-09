package com.codewars;

public class Abbreviator {

    public String abbreviate(String string) {
        var sb = new StringBuilder();
        var buffer = new StringBuilder();

        int codePointCount = string.codePointCount(0, string.length());
        for (int i = 0; i < codePointCount; i++) {
            int cp = string.codePointAt(i);
            if (Character.isAlphabetic(cp)) {
                buffer.appendCodePoint(cp);
            } else {
                if (buffer.length() > 0) {
                    appendBufferToResult(buffer, sb);
                    buffer = new StringBuilder();
                }
                sb.appendCodePoint(cp);
            }
        }
        if (buffer.length() > 0) {
            appendBufferToResult(buffer, sb);
        }
        return sb.toString();
    }

    private StringBuilder appendBufferToResult(StringBuilder buffer, StringBuilder res) {
        if (buffer.length() > 3) {
            res.append(buffer.charAt(0));
            res.append(buffer.length() - 2);
            res.append(buffer.charAt(buffer.length() - 1));
        } else {
            res.append(buffer);
        }
        return res;
    }

}
