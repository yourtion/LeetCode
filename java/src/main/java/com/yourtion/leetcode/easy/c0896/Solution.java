package com.yourtion.leetcode.easy.c0896;

/**
 * 896. 单调数列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/monotonic-array/
 */
public class Solution {
    public boolean isMonotonic(int[] A) {
        boolean up = true;
        boolean down = true;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] == A[i]) {
                continue;
            }
            if (A[i - 1] > A[i]) {
                up = false;
            } else {
                down = false;
            }
            if (!up && !down) {
                return false;
            }
        }
        return true;
    }
}
