package com.yourtion.leetcode.easy.c0598;

/**
 * 598. 范围求和 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/range-addition-ii/
 */
public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minM = m;
        int minN = n;
        for (int[] a : ops) {
            minM = Math.min(minM, a[0]);
            minN = Math.min(minN, a[1]);
        }
        return minM * minN;
    }
}
