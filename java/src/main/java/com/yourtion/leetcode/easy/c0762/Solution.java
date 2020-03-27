package com.yourtion.leetcode.easy.c0762;

/**
 * 762. 二进制表示中质数个计算置位
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/prime-number-of-set-bits-in-binary-representation/
 */
public class Solution {
    public boolean isSmallPrime(int x) {
        return (x == 2 || x == 3 || x == 5 || x == 7 ||
                x == 11 || x == 13 || x == 17 || x == 19);
    }

    public int countPrimeSetBits(int L, int R) {
        int ret = 0;
        for (int i = L; i <= R; i++) {
            int c = Integer.bitCount(i);
            ret += isSmallPrime(c) ? 1 : 0;
        }
        return ret;
    }
}
