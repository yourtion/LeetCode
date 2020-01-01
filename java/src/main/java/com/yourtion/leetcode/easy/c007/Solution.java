package com.yourtion.leetcode.easy.c007;

/**
 * 7. 整数反转
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/reverse-integer/
 */
public class Solution {
    public int reverse(int x) {
        String a = String.valueOf(Math.abs(x));
        String b = new StringBuffer(a).reverse().toString();
        int c = 0;
        try {
            c = Integer.parseInt(b);
        } catch (Exception ignored) {
        }
        if (x < 0) {
            return -1 * c;
        }
        return c;
    }
}