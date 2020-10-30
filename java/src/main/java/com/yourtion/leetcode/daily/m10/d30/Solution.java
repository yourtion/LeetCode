package com.yourtion.leetcode.daily.m10.d30;

/**
 * 463. 岛屿的周长
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/island-perimeter/
 */
public class Solution {
    public int islandPerimeter(int[][] grid) {
        int ret = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            for (int j = 0; j < row.length; j++) {
                if (row[j] == 0) {
                    continue;
                }
                // 上
                ret += i == 0 ? 1 : (grid[i - 1][j] == 0 ? 1 : 0);
                // 下
                ret += i == grid.length - 1 ? 1 : (grid[i + 1][j] == 0 ? 1 : 0);
                // 左
                ret += j == 0 ? 1 : (grid[i][j - 1] == 0 ? 1 : 0);
                // 右
                ret += j == row.length - 1 ? 1 : (grid[i][j + 1] == 0 ? 1 : 0);
            }
        }
        return ret;
    }
}
