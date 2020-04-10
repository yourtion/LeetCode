package com.yourtion.leetcode.daily.m04.d10;

/**
 * 151. 翻转字符串里的单词
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/reverse-words-in-a-string/
 */
public class Solution {
    public String reverseWords(String s) {
        String[] ss = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = ss.length - 1; i >= 0; i--) {
            if (!ss[i].isEmpty()) {
                sb.append(ss[i]).append(" ");
            }
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
    }
}
