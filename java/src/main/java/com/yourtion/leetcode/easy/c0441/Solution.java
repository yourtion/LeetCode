package com.yourtion.leetcode.easy.c0441;

/**
 * 441. 排列硬币
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/arranging-coins/
 */
public class Solution {
    public int arrangeCoins(int n) {
        int i = 1;
        while (n > 0) {
            if (n - i < 0) {
                return i - 1;
            }
            n -= i;
            i += 1;
        }
        return i - 1;
    }
}
