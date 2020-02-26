package com.yourtion.leetcode.easy.c0434;

/**
 * 434. 字符串中的单词数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/number-of-segments-in-a-string/
 */
public class Solution {
    public int countSegments(String s) {
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                ret++;
            }
        }
        return ret;
    }
}
