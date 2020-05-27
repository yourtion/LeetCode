package com.yourtion.leetcode.easy.c9049;

/**
 * 9049. 面试题17. 打印从1到最大的n位数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 */
public class Solution {
    public int[] printNumbers(int n) {
        int c = 1;
        while (n > 0) {
            c *= 10;
            n -= 1;
        }
        int[] ret = new int[c - 1];
        for (int i = 0; i < c - 1; i++) {
            ret[i] = i + 1;
        }
        return ret;
    }
}
