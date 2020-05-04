package com.yourtion.leetcode.easy.c1380;

import java.util.*;

/**
 * 1380. 矩阵中的幸运数
 *
 * @author Yourtion
 * @link
 */
public class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ret = new ArrayList<>();
        // 记录每行最小
        int[] row = new int[matrix.length];
        // 记录每列最大
        int[] col = new int[matrix[0].length];
        Arrays.fill(row, Integer.MAX_VALUE);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // 计算每行最小
                row[i] = Math.min(row[i], matrix[i][j]);
                // 计算每行最大
                col[j] = Math.max(col[j], matrix[i][j]);
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i : row) {
            set.add(i);
        }
        for (int i : col) {
            if (set.contains(i)) {
                ret.add(i);
            }
        }
        return ret;
    }
}
