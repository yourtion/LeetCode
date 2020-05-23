package com.yourtion.leetcode.easy.c9042;

/**
 * 9042. 面试题05. 替换空格
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 */
public class Solution {
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
