package com.yourtion.leetcode.daily.m03.d04;

/**
 * 994. 腐烂的橘子
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/rotting-oranges/
 */
public class Solution {
    void rotting(int[][] grid, int x, int y) {
        // 上
        if (x != 0 && grid[x - 1][y] == 1) {
            grid[x - 1][y] = 3;
        }
        // 下
        if (x != grid.length - 1 && grid[x + 1][y] == 1) {
            grid[x + 1][y] = 3;
        }
        // 左
        if (y != 0 && grid[x][y - 1] == 1) {
            grid[x][y - 1] = 3;
        }
        // 右
        if (y != grid[x].length - 1 && grid[x][y + 1] == 1) {
            grid[x][y + 1] = 3;
        }
    }

    public int orangesRotting(int[][] grid) {
        int ret = 0;
        boolean allRotting = true;
        boolean rotting = true;
        while (rotting) {
            allRotting = true;
            rotting = false;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 2) {
                        rotting(grid, i, j);
                    }
                }
            }
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 1) {
                        allRotting = false;
                    }
                    if (grid[i][j] == 3) {
                        rotting = true;
                        grid[i][j] = 2;
                    }
                }
            }
            if (rotting) {
                ret += 1;
            }
        }
        return !allRotting ? -1 : ret;
    }
}
