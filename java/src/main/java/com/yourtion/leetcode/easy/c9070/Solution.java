package com.yourtion.leetcode.easy.c9070;

/**
 * 9070. 面试题 58 - II. 左旋转字符串
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 */
public class Solution {
    public String reverseLeftWords(String s, int n) {
        int l = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l; i++) {
            int k = (i + n) % l;
            sb.append(s.charAt(k));
        }
        return sb.toString();
    }
}
