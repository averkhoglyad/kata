package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/reverse-integer/">Reverse Integer</a></h3>
 * <p>
 *     Given a signed 32-bit integer <code>x</code>, return <code>x</code> with its digits reversed.
 *     If reversing <code>x</code> causes the value to go outside the signed 32-bit integer range
 *     <code>[-2^31, 2^31 - 1]</code>, then return <code>0</code>.
 * </p>
 * <p>
 *     <strong>Assume the environment does not allow you to store 64-bit integers (signed or unsigned).</strong>
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>-2^31 <= x <= 2^31 - 1</code></li>
 *     </ul>
 * </p>
 */
public class ReverseInteger {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            if (res > (Integer.MAX_VALUE / 10) || res < (Integer.MIN_VALUE / 10)) {
                return 0;
            }
            res = res * 10 +  x % 10;
            x /= 10;
        }
        return res;
    }
}
