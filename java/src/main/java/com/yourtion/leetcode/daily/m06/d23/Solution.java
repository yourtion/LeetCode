package com.yourtion.leetcode.daily.m06.d23;

/**
 * 67. 二进制求和
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/add-binary/
 */
public class Solution {
    public String addBinary(String a, String b) {
        char i0 = '0';
        char i1 = '1';
        StringBuilder sb = new StringBuilder();
        int len = Math.max(a.length(), b.length());
        boolean up = false;
        for (int i = 0; i < len; i++) {
            int ai = Math.max(a.length() - i - 1, -1);
            int bi = Math.max(b.length() - i - 1, -1);
            char aa = ai > -1 ? a.charAt(ai) : i0;
            char bb = bi > -1 ? b.charAt(bi) : i0;
            if (aa == bb) {
                sb.append(up ? i1 : i0);
                up = aa == i1;
            } else {
                sb.append(up ? i0 : i1);
            }
        }
        if (up) {
            sb.append(i1);
        }
        return sb.reverse().toString();
    }
}
