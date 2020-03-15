package com.yourtion.leetcode.daily.m03.d15;

/**
 * 695. 岛屿的最大面积
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/max-area-of-island/
 */
public class Solution {

    int dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = 0;
        int[] di = {0, 0, 1, -1};
        int[] dj = {1, -1, 0, 0};
        int ret = 1;
        for (int index = 0; index != 4; ++index) {
            int nextI = i + di[index], nextJ = j + dj[index];
            ret += dfs(grid, nextI, nextJ);
        }
        return ret;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int ret = 0;
        for (int i = 0; i != grid.length; ++i) {
            for (int j = 0; j != grid[0].length; ++j) {
                ret = Math.max(ret, dfs(grid, i, j));
            }
        }
        return ret;
    }
}
