package com.yourtion.leetcode.easy.c0028;

/**
 * 28. 实现 strStr()
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/implement-strstr/
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) != needle.charAt(0)) {
                continue;
            }
            int k = 1;
            while (k < needle.length()) {
                if (haystack.charAt(i + k) != needle.charAt(k)) {
                    break;
                }
                k += 1;
            }
            if (k == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
