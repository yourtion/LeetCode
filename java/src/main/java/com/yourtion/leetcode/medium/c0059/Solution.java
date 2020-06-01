package com.yourtion.leetcode.medium.c0059;

/**
 * 59. 螺旋矩阵 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/spiral-matrix-ii/
 */
public class Solution {
    private static final int[] DR = {0, 1, 0, -1};
    private static final int[] DC = {1, 0, -1, 0};

    public int[][] generateMatrix(int n) {
        int[][] ret = new int[n][n];
        int r = 0, c = 0, di = 0;
        for (int i = 1; i <= n * n; i++) {
            ret[r][c] = i;
            int cr = r + DR[di];
            int cc = c + DC[di];
            if (cr >= 0 && cr < n && cc >= 0 && cc < n && ret[cr][cc] == 0) {
                r = cr;
                c = cc;
            } else {
                di = (di + 1) % 4;
                r += DR[di];
                c += DC[di];
            }
        }
        return ret;
    }
}
