package com.yourtion.leetcode.easy.c0231;

/**
 * 231. 2的幂
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/power-of-two/
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n >= 2) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }
}
