package com.yourtion.leetcode.easy.c1281;

/**
 * 1281. 整数的各位积和之差
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */
public class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int multiply = 1;
        while (n > 0) {
            int k = n % 10;
            sum += k;
            multiply *= k;
            n /= 10;
        }
        return multiply - sum;
    }
}
