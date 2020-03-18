package com.yourtion.leetcode.easy.c0680;

/**
 * 680. 验证回文字符串 Ⅱ
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/valid-palindrome-ii/
 */
public class Solution {

    public boolean validPalindrome(String s) {
        char[] c = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (c[i] != c[j]) {
                //分两种情况，一是右边减一，二是左边加一
                return isPalindrome(c, i, j - 1) || isPalindrome(c, i + 1, j);
            }
        }
        return true;
    }

    public boolean isPalindrome(char[] c, int i, int j) {
        while (i < j) {
            if (c[i++] != c[j--]) {
                return false;
            }
        }
        return true;
    }
}
