package com.yourtion.leetcode.easy.c0733;

/**
 * 733. 图像渲染
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/flood-fill/
 */
public class Solution {
    void dfs(int[][] grid, int i, int j, int color, int newColor) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length) {
            return;
        }
        if (grid[i][j] != color || grid[i][j] == newColor) {
            return;
        }
        grid[i][j] = newColor;
        int[] di = {0, 0, 1, -1};
        int[] dj = {1, -1, 0, 0};
        for (int index = 0; index != 4; ++index) {
            int nextI = i + di[index], nextJ = j + dj[index];
            dfs(grid, nextI, nextJ, color, newColor);
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int orgColor = image[sr][sc];
        dfs(image, sr, sc, orgColor, newColor);
        return image;
    }
}
