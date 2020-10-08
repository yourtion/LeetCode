package com.yourtion.leetcode.daily.m10.d08;

/**
 * 344. 反转字符串
 *
 * @author Yourtion
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
