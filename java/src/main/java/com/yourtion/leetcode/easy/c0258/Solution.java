package com.yourtion.leetcode.easy.c0258;

/**
 * 258. 各位相加
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/add-digits/
 */
public class Solution {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 9 == 0 ? 9 : num % 9;
    }
}
