package com.yourtion.leetcode.easy.c0014;

/**
 * 14. 最长公共前缀
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/longest-common-prefix/
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        int len = strs[0].length();
        if (len == 0) {
            return "";
        }
        for (String str : strs) {
            if (len > str.length()) {
                len = str.length();
            }
        }
        for (int i = 0; i < len; i++) {
            char a = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != a) {
                    return res.toString();
                }
            }
            res.append(a);
        }
        return res.toString();
    }
}
