package com.yourtion.leetcode.easy.c0693;

/**
 * 693. 交替位二进制数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/binary-number-with-alternating-bits/
 */
public class Solution {
    public boolean hasAlternatingBits(int n) {
        char[] s = Integer.toBinaryString(n).toCharArray();
        char b = s[0];
        for (char c : s) {
            if (c == b) {
                b = b == '0' ? '1' : '0';
            } else {
                return false;
            }
        }
        return true;
    }
}
