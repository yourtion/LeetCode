package com.yourtion.leetcode.daily.m05.d09;

/**
 * 69. x 的平方根
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/sqrtx/
 */
public class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int ans = (int) Math.exp(0.5 * Math.log(x));
        return (long) (ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
    }
}
