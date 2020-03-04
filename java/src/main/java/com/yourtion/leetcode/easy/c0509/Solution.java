package com.yourtion.leetcode.easy.c0509;

/**
 * 509. 斐波那契数
 *
 * @author Yourtion
 * https://leetcode-cn.com/problems/fibonacci-number/
 */
public class Solution {
    int[] map = new int[32];

    public Solution() {
        map[1] = 1;
    }

    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (map[N] != 0) {
            return map[N];
        }
        int res = fib(N - 1) + fib(N - 2);
        map[N] = res;
        return res;
    }
}
