package com.yourtion.leetcode.easy.c0344;

/**
 * 344. 反转字符串
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/reverse-string/
 */
public class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            if (s[i] != s[j]) {
                char a = s[i];
                s[i] = s[j];
                s[j] = a;
            }
            i++;
            j--;
        }
    }
}
