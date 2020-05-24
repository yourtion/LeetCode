package com.yourtion.leetcode.easy.c9046;

/**
 * 9046. 面试题10-II. 青蛙跳台阶问题
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 */
public class Solution {
    public int numWays(int n) {
        if (n <= 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int a = 1, b = 2, c = 4;
        for (int i = 3; i <= n; i++) {
            c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return c % 1000000007;
    }
}
