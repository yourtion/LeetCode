package com.yourtion.leetcode.easy.c9008;

/**
 * 9008. 面试题 01.03. URL化
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/string-to-url-lcci/
 */
public class Solution {
    public String replaceSpaces(String S, int length) {
        char[] chars = S.toCharArray();
        int i = chars.length - 1;
        length -= 1;
        int tarLen = 0;
        while (i >= 0 && length >= 0) {
            if (chars[length] == ' ') {
                chars[i--] = '0';
                chars[i--] = '2';
                chars[i--] = '%';
                tarLen += 3;
            } else {
                chars[i--] = chars[length];
                tarLen += 1;
            }
            length -= 1;
        }
        return String.valueOf(chars, chars.length - tarLen, tarLen);
    }
}
