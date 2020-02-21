package com.yourtion.leetcode.easy.c0367;

/**
 * 367. 有效的完全平方数
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/valid-perfect-square/
 */
public class Solution {
    double sqrt(double c) {
        if (c < 0) {
            return Double.NaN;
        }
        double e = 1;
        double x = c;
        double y = (x + c / x) / 2;
        while (Math.abs(x - y) > e) {
            x = y;
            y = (x + c / x) / 2;
        }
        return x;
    }

    public boolean isPerfectSquare(int num) {
        int i = (int) sqrt(num);
        return num == i * i;
    }
}
