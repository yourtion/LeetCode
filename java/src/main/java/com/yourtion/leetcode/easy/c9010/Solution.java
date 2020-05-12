package com.yourtion.leetcode.easy.c9010;

/**
 * 9010. 面试题 01.09. 字符串轮转
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/string-rotation-lcci/
 */
public class Solution {
    public boolean isFlipedString(String s1, String s2) {
        return s1.length() == s2.length() && (s2 + s2).lastIndexOf(s1) > -1;
    }
}
