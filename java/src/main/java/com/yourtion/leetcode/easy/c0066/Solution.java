package com.yourtion.leetcode.easy.c0066;

/**
 * 66. 加一
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/plus-one/
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += 1;
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                return digits;
            }
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
