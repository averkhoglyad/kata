package com.leetcode;

import java.util.*;

/**
 * <h3><a href="https://leetcode.com/problems/number-of-atoms/">Number of Atoms</a></h3>
 * <p>Given a string <code>formula</code> representing a chemical formula, return the count of each atom.</p>
 * <p>
 * The atomic element always starts with an uppercase character, then zero or more lowercase letters, representing the name.
 * One or more digits representing that element's count may follow if the count is greater than <code>1</code>.
 * If the count is <code>1</code>, no digits will follow.
 * For example, <code>"H2O"</code> and <code>"H2O2"</code> are possible, but <code>"H1O2"</code> is impossible
 * </p>
 * <p>
 * Two formulas are concatenated together to produce another formula.
 * For example, <code>"H2O2He3Mg4"</code> is also a formula.
 * </p>
 * <p>
 * A formula placed in parentheses, and a count (optionally added) is also a formula.
 * For example, <code>"(H2O2)"</code> and <code>"(H2O2)3"</code> are formulas.
 * </p>
 * <p>
 * Return the count of all elements as a string in the following form:
 * the first name (in sorted order), followed by its count (if that count is more than <code>1</code>),
 * followed by the second name (in sorted order), followed by its count (if that count is more than <code>1</code>), and so on.
 * </p>
 * <p>The test cases are generated so that all the values in the output fit in a <strong>32-bit</strong> integer.</p>
 * <p>
 * <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= formula.length <= 1000</code>.</li>
 *         <li><code>formula</code> consists of English letters, digits, <code>'('</code>, and <code>')'</code>.</li>
 *         <li><code>formula</code> is always valid.</li>
 *     </ul>
 * </p>
 */
public class NumberOfAtoms {
    public String countOfAtoms(String formula) {
        return atomsToFormula(collectAtoms(formula));
    }

    private Map<String, Integer> collectAtoms(String formula) {
        var atomsStack = new ArrayDeque<Map<String, Integer>>();
        char[] charArray = formula.toCharArray();
        for (int i = 0, charArrayLength = charArray.length; i < charArrayLength;) {
            char ch = charArray[i++];
            if (ch == '(') {
                atomsStack.add(Collections.emptyMap());
            } else if (ch == ')') {
                Map<String, Integer> current = atomsStack.removeLast();
                Map<String, Integer> res = current;
                do {
                    current = atomsStack.removeLast();
                    res = add(res, current);
                } while (!current.isEmpty());
                atomsStack.add(res);
            } else if (Character.isDigit(ch)) {
                var count = ch - '0';
                for (; i < charArrayLength && Character.isDigit(charArray[i]); i++) {
                    count = count * 10 + charArray[i] - '0';
                }
                atomsStack.add(multiply(atomsStack.removeLast(), count));
            } else {
                var element = new StringBuilder();
                element.append(ch);
                while (i < charArrayLength && Character.isLowerCase(charArray[i])) {
                    element.append(charArray[i++]);
                }
                atomsStack.add(new HashMap<>(Map.of(element.toString(), 1)));
            }
        }

        return atomsStack.stream()
                .reduce(new TreeMap<>(), this::add);
    }

    private Map<String, Integer> multiply(Map<String, Integer>  map, int k) {
        map.replaceAll((__, v) -> v * k);
        return map;
    }

    private Map<String, Integer> add(Map<String, Integer>  map, Map<String, Integer>  sub) {
        sub.forEach((key, leftValue) ->
                map.compute(key, (__, rightValue) -> rightValue == null ? leftValue : rightValue + leftValue));
        return map;
    }

    private String atomsToFormula(Map<String, Integer> atoms) {
        var sb = new StringBuilder();
        for (var entry : atoms.entrySet()) {
            sb.append(entry.getKey());
            if (entry.getValue() > 1) {
                sb.append(entry.getValue().toString());
            }
        }
        return sb.toString();
    }
}
