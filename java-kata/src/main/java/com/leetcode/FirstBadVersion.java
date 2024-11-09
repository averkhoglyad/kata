package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/flood-fill/">First Bad Version</a></h3>
 * <p>
 *     You are a product manager and currently leading a team to develop a new product.
 *     Unfortunately, the latest version of your product fails the quality check.
 *     Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * </p>
 * <p>
 *     Suppose you have <code>n</code> versions <code>[1, 2, ..., n]</code> and you want to find out the first bad one,
 *     which causes all the following ones to be bad.
 * </p>
 * <p>
 *     You are given an API <code>bool isBadVersion(version)</code> which returns whether version is bad.
 *     Implement a function to find the first bad <code>version</code>.
 *     You should minimize the number of calls to the API.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= bad <= n <= 2^31 - 1</code></li>
 *     </ul>
 * </p>
 */

/*
    The isBadVersion API is defined in the parent class VersionControl.
    boolean isBadVersion(int version);
*/
public class FirstBadVersion extends VersionControl {

    FirstBadVersion(int bad) {
        super(bad);
    }

    public int firstBadVersion(int n) {
        var min = 1;
        var max = n;
        while (min <= max) {
            var mid = min + (max - min) / 2;
            if (isBadVersion(mid)) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }
}

class VersionControl {

    private final int bad;

    VersionControl(int bad) {
        this.bad = bad;
    }

    protected final boolean isBadVersion(int version) {
        return version >= bad;
    }
}
