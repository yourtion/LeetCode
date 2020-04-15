package com.yourtion.leetcode.daily.m04.d15;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 542. 01 矩阵
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/01-matrix/
 */
public class Solution {
    private int[][] dirs = new int[][]{new int[]{-1, 0}, new int[]{1, 0}, new int[]{0, -1}, new int[]{0, 1}};

    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dist = new int[m][n];
        int[][] seen = new int[m][n];
        Queue<int[]> q = new LinkedList<>();

        // 将所有的 0 添加进初始队列中
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] == 0) {
                    q.add(new int[]{i, j});
                    seen[i][j] = 1;
                }
            }
        }
        // 广度优先搜索
        while (!q.isEmpty()) {
            int[] a = q.poll();
            int i = a[0];
            int j = a[1];
            for (int d = 0; d < 4; ++d) {
                int ni = i + dirs[d][0];
                int nj = j + dirs[d][1];
                if (ni >= 0 && ni < m && nj >= 0 && nj < n && seen[ni][nj] == 0) {
                    dist[ni][nj] = dist[i][j] + 1;
                    q.add(new int[]{ni, nj});
                    seen[ni][nj] = 1;
                }
            }
        }
        return dist;
    }
}
