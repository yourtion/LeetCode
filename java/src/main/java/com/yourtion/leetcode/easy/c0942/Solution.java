package com.yourtion.leetcode.easy.c0942;

/**
 * 942. 增减字符串匹配
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/di-string-match/
 */
public class Solution {
    public int[] diStringMatch(String S) {
        int n = S.length();
        int l = 0, h = n;
        int[] arr = new int[S.length() + 1];
        for (int i = 0; i < n; ++i) {
            if (S.charAt(i) == 'I') {
                arr[i] = l++;
            } else {
                arr[i] = h--;
            }
        }
        arr[n] = l;
        return arr;
    }
}
