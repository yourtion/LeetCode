package com.yourtion.leetcode.daily.m12.d03;

/**
 * 204. 计数质数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/count-primes/
 */
public class Solution {
    public int countPrimes(int n) {
        int count = 0;
        int[] signs = new int[n / 32 + 1];
        for (int i = 2; i < n; i++) {
            if ((signs[i / 32] & (1 << (i & 31))) == 0) {
                count++;
                for (int j = i + i; j < n; j += i) {
                    //登记该数字
                    signs[j / 32] |= 1 << (j & 31);
                }
            }
        }
        return count;
    }
}
