package com.yourtion.leetcode.easy.c0482;

/**
 * 482. 密钥格式化
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/license-key-formatting/
 */
public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        int a = 0;
        char[] arr = S.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '-') {
                continue;
            }
            if (a == 0) {
                sb.insert(0, "-");
            }
            sb.insert(0, Character.toUpperCase(arr[i]));
            a++;
            if (a == K) {
                a = 0;
            }
        }
        if (sb.length() < 1) {
            return "";
        }
        return sb.substring(0, sb.length() - 1);
    }
}
