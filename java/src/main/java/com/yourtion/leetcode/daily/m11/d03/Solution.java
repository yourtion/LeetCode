package com.yourtion.leetcode.daily.m11.d03;

/**
 * 941. 有效的山脉数组
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/valid-mountain-array/
 */
public class Solution {
    public boolean validMountainArray(int[] A) {
        boolean up = false;
        boolean down = false;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1]) {
                return false;
            }
            if (A[i] > A[i - 1]) {
                if (!down) {
                    up = true;
                } else {
                    return false;
                }
            }
            if (A[i] < A[i - 1]) {
                if (up) {
                    down = true;
                } else {
                    return false;
                }
            }
        }
        return up && down;
    }
}
