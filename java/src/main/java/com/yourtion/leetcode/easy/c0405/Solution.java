package com.yourtion.leetcode.easy.c0405;

/**
 * 405. 数字转换为十六进制数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/convert-a-number-to-hexadecimal/
 */
public class Solution {

    public static final String[] map = "0123456789abcdef".split("");

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.insert(0, map[(num & 15)]);
            num >>>= 4;
        }
        return sb.toString();
    }
}
