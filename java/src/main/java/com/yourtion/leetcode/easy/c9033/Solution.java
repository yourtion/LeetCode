package com.yourtion.leetcode.easy.c9033;

/**
 * 9033. 面试题 16.11. 跳水板
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/diving-board-lcci/
 */
public class Solution {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{k};
        }
        int[] ret = new int[k + 1];
        int d = longer - shorter;
        ret[0] = shorter * k;
        for (int i = 1; i <= k; i++) {
            ret[i] = ret[i - 1] + d;
        }
        return ret;
    }
}
