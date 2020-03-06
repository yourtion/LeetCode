package com.yourtion.leetcode.easy.c0541;

/**
 * 541. 反转字符串 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/reverse-string-ii/
 */
public class Solution {
    public String reverseStr(String s, int k) {
        if (s.length() < 2 || k == 1) {
            return s;
        }
        char[] arr = s.toCharArray();
        char[] ret = new char[arr.length];
        int i = 0;
        while (i < arr.length) {
            int l = arr.length - i;
            if (l > 2 * k) {
                l = 2 * k;
            }
            if (l >= k) {
                for (int j = 0; j < k; j++) {
                    ret[i + j] = arr[i + k - j - 1];
                }
                for (int j = 0; j < l - k; j++) {
                    ret[i + k + j] = arr[i + k + j];
                }
            } else {
                for (int j = 0; j < l; j++) {
                    ret[i + j] = arr[i + l - j - 1];
                }
            }
            i += l;
        }
        return new String(ret);
    }
}
