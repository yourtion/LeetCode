package com.yourtion.leetcode.easy.c0766;

/**
 * 766. 托普利茨矩阵
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/toeplitz-matrix/
 */
public class Solution {
    boolean isToeplitzMatrixLine(int[][] matrix, int i, int j) {
        int a = matrix[i][j];
        while (i < matrix.length && j < matrix[0].length) {
            if (matrix[i][j] != a) {
                return false;
            }
            i += 1;
            j += 1;
        }
        return true;
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            if (!isToeplitzMatrixLine(matrix, 0, i)) {
                return false;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (!isToeplitzMatrixLine(matrix, i, 0)) {
                return false;
            }
        }
        return true;
    }
}
