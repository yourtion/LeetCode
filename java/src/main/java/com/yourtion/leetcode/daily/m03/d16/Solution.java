package com.yourtion.leetcode.daily.m03.d16;

/**
 * 面试题 01.06. 字符串压缩
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/compress-string-lcci/
 */
public class Solution {
    public String compressString(String S) {
        int count = 1;
        char[] chars = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 == chars.length || chars[i] != chars[i + 1]) {
                sb.append(chars[i]).append(count);
                count = 0;
            }
            count += 1;
        }
        String ret = sb.toString();
        return ret.length() >= S.length() ? S : ret;
    }
}
