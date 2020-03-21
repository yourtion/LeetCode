package com.yourtion.leetcode.daily.m03.d21;

/**
 * 365. 水壶问题
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/water-and-jug-problem/
 */
public class Solution {
    public int gcd(int a, int b) {
        int r;
        while (b > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) {
            return false;
        }
        if (x == 0 || y == 0) {
            return z == 0 || x + y == z;
        }
        return z % gcd(x, y) == 0;
    }
}
