package com.yourtion.leetcode.easy.c0263;

/**
 * 263. 丑数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/ugly-number/
 */
public class Solution {
    public boolean isUgly(int num) {
        while (num > 0 && num % 5 == 0) {
            num /= 5;
        }
        while (num > 0 && num % 3 == 0) {
            num /= 3;
        }
        while (num > 0 && num % 2 == 0) {
            num /= 2;
        }
        return num == 1;
    }
}
