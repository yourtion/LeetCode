package com.yourtion.leetcode.daily.m08.d24;

/**
 * 459. 重复的子字符串
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/repeated-substring-pattern/
 */
public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int c = 1;
        char[] arr = s.toCharArray();
        while (c < arr.length / 2 + 1) {
            if (arr.length % c == 0) {
                int i = 0;
                int j = 1;
                while (i < arr.length) {
                    if (arr[i] != arr[j - 1]) {
                        break;
                    }
                    i++;
                    j = j < c ? j + 1 : 1;
                }
                if (i == arr.length) {
                    return true;
                }
            }
            c += 1;
        }
        return false;
    }
}
