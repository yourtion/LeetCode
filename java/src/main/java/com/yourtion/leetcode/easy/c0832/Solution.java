package com.yourtion.leetcode.easy.c0832;

/**
 * 832. 翻转图像
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/flipping-an-image/
 */
public class Solution {
    private int[] flipAndInvertLine(int[] line) {
        int[] ret = new int[line.length];
        int i = 0;
        int j = line.length - 1;
        while (i <= j) {
            if (i == j) {
                ret[i] = line[i] == 0 ? 1 : 0;
            } else {
                ret[i] = line[j] == 0 ? 1 : 0;
                ret[j] = line[i] == 0 ? 1 : 0;
            }
            i++;
            j--;
        }
        return ret;
    }

    public int[][] flipAndInvertImage(int[][] A) {
        int[][] ret = new int[A.length][];
        for (int i = 0; i < A.length; i++) {
            ret[i] = flipAndInvertLine(A[i]);
        }
        return ret;
    }
}
