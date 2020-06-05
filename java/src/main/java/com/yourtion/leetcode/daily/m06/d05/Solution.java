package com.yourtion.leetcode.daily.m06.d05;

/**
 * 面试题29. 顺时针打印矩阵
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/
 */
public class Solution {
    private static final int[] DR = {0, 1, 0, -1};
    private static final int[] DC = {1, 0, -1, 0};

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length < 1) {
            return new int[0];
        }
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] seen = new boolean[m][n];
        int r = 0, c = 0, di = 0;
        int[] res = new int[m * n];
        for (int i = 0; i < m * n; i++) {
            res[i] = matrix[r][c];
            seen[r][c] = true;
            int cr = r + DR[di];
            int cc = c + DC[di];
            if (0 <= cr && cr < m && 0 <= cc && cc < n && !seen[cr][cc]) {
                r = cr;
                c = cc;
            } else {
                di = (di + 1) % 4;
                r += DR[di];
                c += DC[di];
            }
        }
        return res;
    }
}
