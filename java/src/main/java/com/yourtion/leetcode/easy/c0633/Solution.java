package com.yourtion.leetcode.easy.c0633;

/**
 * 633. 平方数之和
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/sum-of-square-numbers/
 */
public class Solution {
    int isPerfectSquare(int num) {
        if (num < 2) {
            return num;
        }

        long x = num / 2;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }
        return x * x == num ? (int) x : -1;
    }

    public boolean judgeSquareSum(int c) {
        if (c == 0 || c == 1) {
            return true;
        }
        int a = 1;
        while (a < c / 2 + 1) {
            int r = isPerfectSquare(c - a * a);
            if (r != -1) {
                return c == a * a + r * r;
            }
            a += 1;
        }
        return false;
    }
}
