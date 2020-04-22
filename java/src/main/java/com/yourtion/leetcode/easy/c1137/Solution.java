package com.yourtion.leetcode.easy.c1137;

/**
 * 1137. 第 N 个泰波那契数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/n-th-tribonacci-number/
 */
public class Solution {
    private int[] map;

    Solution() {
        map = new int[38];
        int i = 0;
        map[i++] = 0;
        map[i++] = 1;
        map[i++] = 1;
        while (i < 38) {
            map[i] = map[i - 1] + map[i - 2] + map[i - 3];
            i += 1;
        }
    }

    public int tribonacci(int n) {
        return map[n];
    }
}
