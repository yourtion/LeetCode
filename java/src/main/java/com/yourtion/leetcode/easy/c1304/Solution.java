package com.yourtion.leetcode.easy.c1304;

/**
 * 1304. 和为零的N个唯一整数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/find-n-unique-integers-sum-up-to-zero/
 */
public class Solution {
    public int[] sumZero(int n) {
        int[] ret = new int[n];
        int k = n / 2;
        for (int i = 1; i <= k; i++) {
            ret[i - 1] = -1 * i;
            ret[i + k - 1] = i;
        }
        return ret;
    }
}
