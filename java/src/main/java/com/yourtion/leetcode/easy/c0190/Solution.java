package com.yourtion.leetcode.easy.c0190;

/**
 * 190. 颠倒二进制位
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/reverse-bits/
 */
public class Solution {
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n)).reverse();
        while (sb.length() < 32) {
            sb.append("0");
        }
        return Integer.parseUnsignedInt(sb.toString(), 2);
    }
}
