package com.yourtion.leetcode.daily.m12.d18;

/**
 * 389. 找不同
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/find-the-difference/
 */
public class Solution {
    public char findTheDifference(String s, String t) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            cnt[ch - 'a']++;
        }
        for (int i = 0; i < t.length(); ++i) {
            char ch = t.charAt(i);
            cnt[ch - 'a']--;
            if (cnt[ch - 'a'] < 0) {
                return ch;
            }
        }
        return ' ';
    }
}
