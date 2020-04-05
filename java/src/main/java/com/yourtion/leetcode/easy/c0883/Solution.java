package com.yourtion.leetcode.easy.c0883;

/**
 * 883. 三维形体投影面积
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/projection-area-of-3d-shapes/
 */
public class Solution {
    public int projectionArea(int[][] grid) {
        int ret = 0;
        for (int i = 0; i < grid.length; ++i) {
            // largest of grid[i][j]
            int bestRow = 0;
            // largest of grid[j][i]
            int bestCol = 0;
            for (int j = 0; j < grid.length; ++j) {
                if (grid[i][j] > 0) {
                    ret++;  // top shadow
                }
                bestRow = Math.max(bestRow, grid[i][j]);
                bestCol = Math.max(bestCol, grid[j][i]);
            }
            ret += bestRow + bestCol;
        }
        return ret;
    }
}
