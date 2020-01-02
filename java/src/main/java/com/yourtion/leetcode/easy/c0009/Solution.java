package com.yourtion.leetcode.easy.c0009;

/**
 * 9. 回文数
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/palindrome-number/
 */
public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        String[] a = String.valueOf(x).split("");
        int len = Math.floorDiv(a.length, 2);
        for (int i = 0; i < len; i++) {
            if (!a[i].equals(a[a.length - i - 1])) {
                return false;
            }
        }
        return true;
    }
}