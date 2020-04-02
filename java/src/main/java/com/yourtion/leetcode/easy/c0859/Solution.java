package com.yourtion.leetcode.easy.c0859;

/**
 * 859. 亲密字符串
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/buddy-strings/
 */
public class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if (A.equals(B)) {
            int[] table = new int[26];
            for (char c : A.toCharArray()) {
                table[c - 'a'] += 1;
            }
            for (int c : table) {
                if (c >= 2) {
                    return true;
                }
            }
            return false;
        } else {
            int first = -1, second = -1;
            for (int i = 0; i < A.length(); ++i) {
                if (A.charAt(i) != B.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }
            return (second != -1 && A.charAt(first) == B.charAt(second) && A.charAt(second) == B.charAt(first));
        }
    }
}
