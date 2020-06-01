package com.yourtion.leetcode.medium.c0054;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. 螺旋矩阵
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/spiral-matrix/
 */
public class Solution {
    private static final int[] DR = {0, 1, 0, -1};
    private static final int[] DC = {1, 0, -1, 0};

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length < 1) {
            return new ArrayList<>();
        }
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] seen = new boolean[m][n];
        int r = 0, c = 0, di = 0;
        List<Integer> res = new ArrayList<>(m * n);
        for (int i = 0; i < m * n; i++) {
            res.add(matrix[r][c]);
            seen[r][c] = true;
            int cr = r + DR[di];
            int cc = c + DC[di];
            if (0 <= cr && cr < m && 0 <= cc && cc < n && !seen[cr][cc]) {
                r = cr;
                c = cc;
            } else {
                di = (di + 1) % 4;
                r += DR[di];
                c += DC[di];
            }
        }
        return res;
    }
}
