package com.yourtion.leetcode.easy.c1351;

/**
 * 1351. 统计有序矩阵中的负数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */
public class Solution {
    private int count(int[] row) {
        int c = row.length;
        for (int a : row) {
            if (a < 0) {
                return c;
            }
            c -= 1;
        }
        return c;
    }

    public int countNegatives(int[][] grid) {
        int ret = 0;
        for (int[] row : grid) {
            ret += count(row);
        }
        return ret;
    }
}
