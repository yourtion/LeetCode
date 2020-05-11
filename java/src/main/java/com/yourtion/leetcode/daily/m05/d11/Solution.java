package com.yourtion.leetcode.daily.m05.d11;

/**
 * 50. Pow(x, n)
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/powx-n/
 */
public class Solution {
    public double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }

    public double myPow(double x, int n) {
        return (long) n >= 0 ? quickMul(x, n) : 1.0 / quickMul(x, -(long) n);
    }
}
