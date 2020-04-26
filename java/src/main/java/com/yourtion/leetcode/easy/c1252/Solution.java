package com.yourtion.leetcode.easy.c1252;

/**
 * 1252. 奇数值单元格的数目
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/cells-with-odd-values-in-a-matrix/
 */
public class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] cell = new int[n][m];
        for (int[] k : indices) {
            for (int i = 0; i < m; i++) {
                cell[k[0]][i] += 1;
            }
            for (int i = 0; i < n; i++) {
                cell[i][k[1]] += 1;
            }
        }
        int ret = 0;
        for (int[] a : cell) {
            for (int b : a) {
                if (b % 2 == 1) {
                    ret += 1;
                }
            }
        }
        return ret;
    }
}
