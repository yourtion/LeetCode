package com.yourtion.leetcode.daily.m12.d07;

/**
 * 861. 翻转矩阵后的得分
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/score-after-flipping-matrix/
 */
public class Solution {
    public int matrixScore(int[][] A) {
        int m = A.length, n = A[0].length;
        int ret = m * (1 << (n - 1));

        for (int j = 1; j < n; j++) {
            int nOnes = 0;
            for (int[] ints : A) {
                if (ints[0] == 1) {
                    nOnes += ints[j];
                } else {
                    // 如果这一行进行了行反转，则该元素的实际取值为 1 - A[i][j]
                    nOnes += (1 - ints[j]);
                }
            }
            int k = Math.max(nOnes, m - nOnes);
            ret += k * (1 << (n - j - 1));
        }
        return ret;
    }
}
