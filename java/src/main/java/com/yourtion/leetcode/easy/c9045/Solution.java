package com.yourtion.leetcode.easy.c9045;

/**
 * 9045. 面试题10-I. 斐波那契数列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 */
public class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }
        int pre = 1;
        int ret = 1;
        for (int i = 3; i <= n; i++) {
            int sum = (pre + ret) % 1000000007;
            pre = ret;
            ret = sum;
        }
        return ret % 1000000007;
    }
}
