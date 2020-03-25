package com.yourtion.leetcode.daily.m03.d25;

/**
 * 892. 三维形体的表面积
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/surface-area-of-3d-shapes/
 */
public class Solution {
    public int surfaceArea(int[][] grid) {
        int N = grid.length;
        int res = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 上边露出的表面积
                res += i - 1 >= 0 ? Math.max(grid[i][j] - grid[i - 1][j], 0) : grid[i][j];
                // 下边露出的表面积
                res += i + 1 < N ? Math.max(grid[i][j] - grid[i + 1][j], 0) : grid[i][j];
                // 左边露出的表面积
                res += j - 1 >= 0 ? Math.max(grid[i][j] - grid[i][j - 1], 0) : grid[i][j];
                // 右边露出的表面积
                res += j + 1 < N ? Math.max(grid[i][j] - grid[i][j + 1], 0) : grid[i][j];
                // 顶部、底部的表面积
                res += 2 * (grid[i][j] > 0 ? 1 : 0);
            }
        }
        return res;
    }
}
