package com.yourtion.leetcode.daily.m07.d23;

/**
 * 64. 最小路径和
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/minimum-path-sum/
 */
public class Solution {
    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i > 0 && j > 0) {
                    grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
                } else if (i > 0) {
                    grid[i][j] += grid[i - 1][j];
                } else if (j > 0) {
                    grid[i][j] += grid[i][j - 1];
                }
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
