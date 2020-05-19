package com.yourtion.leetcode.easy.c9029;

/**
 * 9029. 面试题 08.10. 颜色填充
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/color-fill-lcci/
 */
public class Solution {
    private static final int[] X = new int[]{0, 0, -1, 1};
    private static final int[] Y = new int[]{-1, 1, 0, 0};

    private void dfs(int[][] image, int r, int c, int oldColor, int newColor) {
        if (r < 0 || c < 0 || r >= image.length || c >= image[r].length || image[r][c] != oldColor || image[r][c] == newColor) {
            return;
        }
        image[r][c] = newColor;
        for (int i = 0; i < X.length; i++) {
            dfs(image, r + X[i], c + Y[i], oldColor, newColor);
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int old = image[sr][sc];
        dfs(image, sr, sc, old, newColor);
        return image;
    }
}
