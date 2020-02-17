package com.yourtion.leetcode.easy.c0278;

class VersionControl {
    private int v;

    public VersionControl(int version) {
        v = version;
    }

    boolean isBadVersion(int version) {
        return version >= v;
    }
}

/**
 * 278. 第一个错误的版本
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/first-bad-version/
 */
public class Solution extends VersionControl {
    public Solution(int version) {
        super(version);
    }

    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        while (start < end) {
            // 中位数先写`int mid = (eft + right) >>> 1;`
            int mid = (start + end) >>> 1;
            boolean isM = isBadVersion(mid);
            if (isM) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // 对“夹逼“剩下的那个数单独做一次判断
        if (isBadVersion(start)) {
            return start;
        }
        return Math.min(start + 1, n);
    }
}
