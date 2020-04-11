package com.yourtion.leetcode.easy.c0949;

import java.util.Arrays;

/**
 * 949. 给定数字能组成的最大时间
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/largest-time-for-given-digits/
 */
public class Solution {
    private boolean verifyTime(int h, int m) {
        return h >= 0 && h < 24 && m >= 0 && m < 60;
    }

    public String largestTimeFromDigits(int[] A) {
        Arrays.sort(A);
        int max = -1;
        String ret = "";
        int[][] m = new int[][]{
                {0, 1, 2, 3}, {1, 2, 3, 0}, {2, 3, 0, 1}, {3, 0, 1, 2},
                {0, 1, 3, 2}, {1, 3, 2, 0}, {3, 2, 0, 1}, {2, 0, 1, 3},
                {0, 2, 3, 1}, {2, 3, 1, 0}, {3, 1, 0, 2}, {1, 0, 2, 3},
                {0, 2, 1, 3}, {2, 1, 3, 0}, {1, 3, 0, 2}, {3, 0, 2, 1},
                {0, 3, 1, 2}, {3, 1, 2, 0}, {1, 2, 0, 3}, {2, 0, 3, 1},
                {0, 3, 2, 1}, {3, 2, 1, 0}, {2, 1, 0, 3}, {1, 0, 3, 1},
        };
        for (int[] c : m) {
            if (verifyTime(A[c[0]] * 10 + A[c[1]], A[c[2]] * 10 + A[c[3]])) {
                int a = A[c[0]] * 1000 + A[c[1]] * 100 + A[c[2]] * 10 + A[c[3]];
                if (a >= max) {
                    ret = String.valueOf(A[c[0]]) + A[c[1]] + ":" + A[c[2]] + A[c[3]];
                    max = a;
                }
            }
        }
        return ret;
    }
}
