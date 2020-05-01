package com.yourtion.leetcode.easy.c1332;

/**
 * 1332. 删除回文子序列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/remove-palindromic-subsequences/
 */
public class Solution {
    public int removePalindromeSub(String s) {
        if ("".equals(s)) {
            return 0;
        }
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return 2;
            }
        }
        return 1;
    }
}
