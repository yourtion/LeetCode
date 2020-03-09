package com.yourtion.leetcode.easy.c0566;

/**
 * 566. 重塑矩阵
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/reshape-the-matrix/
 */
public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length < 1 || nums[0].length < 1) {
            return nums;
        }
        if (nums.length * nums[0].length != r * c) {
            return nums;
        }
        int[][] ret = new int[r][c];
        int a = 0, b = 0;
        for (int[] i : nums) {
            for (int j : i) {
                ret[a][b] = j;
                if (b == c - 1) {
                    a += 1;
                    b = 0;
                } else {
                    b += 1;
                }
            }
        }
        return ret;
    }
}
