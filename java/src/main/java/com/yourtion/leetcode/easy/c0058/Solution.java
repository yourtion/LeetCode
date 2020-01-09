package com.yourtion.leetcode.easy.c0058;

/**
 * 58. 最后一个单词的长度
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/length-of-last-word/
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        String[] ss = s.split(" ");
        if (ss.length < 1) {
            return 0;
        }
        return ss[ss.length - 1].length();
    }
}
