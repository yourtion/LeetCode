package com.yourtion.leetcode.daily.m06.d19;

/**
 * 125. 验证回文串
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/valid-palindrome/
 */
public class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i += 1;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j -= 1;
                continue;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i += 1;
            j -= 1;
        }
        return true;
    }
}
