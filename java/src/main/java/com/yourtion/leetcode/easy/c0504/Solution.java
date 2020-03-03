package com.yourtion.leetcode.easy.c0504;

/**
 * 504. 七进制数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/base-7/
 */
public class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean negative = num < 0;
        num = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.insert(0, num % 7);
            num /= 7;
        }
        if (negative) {
            sb.insert(0, "-");
        }
        return sb.toString();
    }
}
