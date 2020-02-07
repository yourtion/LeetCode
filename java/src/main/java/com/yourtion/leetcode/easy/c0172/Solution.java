package com.yourtion.leetcode.easy.c0172;

/**
 * 172. 阶乘后的零
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/factorial-trailing-zeroes/submissions/
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
