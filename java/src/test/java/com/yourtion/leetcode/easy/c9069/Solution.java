package com.yourtion.leetcode.easy.c9069;

/**
 * 9069. 面试题 58 - I. 翻转单词顺序
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/
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
