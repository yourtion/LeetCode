package com.yourtion.leetcode.daily.m05.d21;

/**
 * 5. 最长回文子串
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/longest-palindromic-substring/
 */
public class Solution {
    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        if (arr.length < 2) {
            return s;
        }
        int max = 1;
        int mI = 0;
        int mJ = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + max; j < arr.length; j++) {
                if (isPalindrome(arr, i, j)) {
                    max = Math.max(max, j - i);
                    mI = i;
                    mJ = j;
                }
            }
        }
        return s.substring(mI, mJ + 1);
    }

    private boolean isPalindrome(char[] arr, int i, int j) {
        while (i <= j) {
            if (arr[i++] != arr[j--]) {
                return false;
            }
        }
        return true;
    }
}
