package com.yourtion.leetcode.easy.c0202;

/**
 * 202. 快乐数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/happy-number/
 */
public class Solution {
    public boolean isHappy(int n) {
        if (n == 1 || n == 7) {
            return true;
        } else if (n < 10) {
            return false;
        }
        int res = 0;
        while (n > 0) {
            int bit = n % 10;
            res += bit * bit;
            n = n / 10;
        }
        return isHappy(res);
    }
}
