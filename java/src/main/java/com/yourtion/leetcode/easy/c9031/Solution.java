package com.yourtion.leetcode.easy.c9031;

/**
 * 9031. 面试题 16.05. 阶乘尾数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/factorial-zeros-lcci/
 */
public class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        while (n > 0) {
            res += n / 5;
            n = n / 5;
        }
        return res;
    }
}
