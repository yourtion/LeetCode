package com.yourtion.leetcode.easy.c9021;

/**
 * 9021. 面试题 05.03. 翻转数位
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/reverse-bits-lcci/
 */
public class Solution {
    public int reverseBits(int num) {
        char[] chars = Integer.toBinaryString(num).toCharArray();
        int c = 0;
        boolean allOne = true;
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1 || chars[i] == '0') {
                allOne = allOne && chars[i] == '1';
                int count = 0;
                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] == '1' || i == j) {
                        count += 1;
                    } else {
                        c = Math.max(c, count);
                        count = 0;
                    }
                }
                c = Math.max(c, count);
            }
        }
        return allOne ? c + 1 : c;
    }
}
