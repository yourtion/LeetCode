package com.yourtion.leetcode.easy.c9030;

/**
 * 9030. 面试题 10.05. 稀疏数组搜索
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/sparse-array-search-lcci/
 */
public class Solution {
    public int findString(String[] words, String s) {
        for (int i = 0; i < words.length; i++) {
            if ("".equals(words[i])) {
                continue;
            }
            if (words[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }
}
