package com.yourtion.leetcode.easy.c0661;

/**
 * 661. 图片平滑器
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/image-smoother/
 */
public class Solution {
    int getPointValue(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length) {
            return -1;
        }
        return grid[i][j];
    }


    int calculate(int[][] m, int i, int j) {
        // 中间
        int ret = 0;
        int c = 0;
        int[] di = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
        int[] dj = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        for (int index = 0; index < di.length; ++index) {
            int nextI = i + di[index], nextJ = j + dj[index];
            int r = getPointValue(m, nextI, nextJ);
            if (r > -1) {
                ret += r;
                c += 1;
            }
        }
        return Math.floorDiv(ret, c);
    }

    public int[][] imageSmoother(int[][] M) {
        int[][] ret = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                ret[i][j] = calculate(M, i, j);
            }
        }
        return ret;
    }
}
