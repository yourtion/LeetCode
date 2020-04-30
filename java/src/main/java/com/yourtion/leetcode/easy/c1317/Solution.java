package com.yourtion.leetcode.easy.c1317;

/**
 * 1317. 将整数转换为两个无零整数的和
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/
 */
public class Solution {
    private int getZeroPos(int n) {
        int c = -1;
        while (n > 0) {
            c += 1;
            if (n % 10 == 0) {
                return c;
            }
            n /= 10;
        }
        return -1;
    }

    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            if (getZeroPos(i) == -1 && getZeroPos(n - i) == -1) {
                return new int[]{i, n - i};
            }
        }
        return new int[]{1, n - 1};
    }
}
