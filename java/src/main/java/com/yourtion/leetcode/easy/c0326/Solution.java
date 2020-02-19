package com.yourtion.leetcode.easy.c0326;

/**
 * 326. 3的幂
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/power-of-three/
 */
public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}

