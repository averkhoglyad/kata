package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/palindrome-number/">Palindrome Number</a></h3>
 * <p>
 *     Given an integer <code>x</code>, return <code>true</code> if <code>x</code> is a palindrome, and <code>false</code> otherwise
 * </p>
 *
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>-2^31 <= x <= 2^31 - 1</code></li>
 *     </ul>
 * </p>
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        if (x < 100 && x % 11 == 0) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }

        int digits = (int) Math.log10(x) + 1;
        int df = x % (int) Math.pow(10, digits / 2);
        int dl = x / (int) Math.pow(10, digits / 2);
        if (digits % 2 != 0) {
            dl /= 10;
        }

        var ds = 0;
        while (dl != 0) {
            ds = ds * 10 +  dl % 10;
            dl /= 10;
        }

        return ds == df;

//        for (int i = 0, max = digits / 2; i < max; i++) {
//            int df = (x / (int) Math.pow(10, i)) % 10;
//            int dl = (x / (int) Math.pow(10, digits - i - 1)) % 10;
//            if (df != dl) {
//                return false;
//            }
//        }
//        return true;
    }
}
