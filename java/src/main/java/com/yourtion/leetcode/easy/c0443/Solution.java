package com.yourtion.leetcode.easy.c0443;

/**
 * 443. 压缩字符串
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/string-compression/
 */
public class Solution {
    public int compress(char[] chars) {
        int anchor = 0;
        int pos = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 == chars.length || chars[i] != chars[i + 1]) {
                chars[pos++] = chars[anchor];
                if (i > anchor) {
                    for (char c : ("" + (i - anchor + 1)).toCharArray()) {
                        chars[pos++] = c;
                    }
                }
                anchor = i + 1;
            }
        }
        return pos;
    }
}
