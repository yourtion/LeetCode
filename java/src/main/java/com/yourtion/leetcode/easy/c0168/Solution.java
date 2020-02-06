package com.yourtion.leetcode.easy.c0168;

/**
 * 168. Excel表列名称
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/excel-sheet-column-title/
 */
public class Solution {
    static String[] a = "ZABCDEFGHIJKLMNOPQRSTUVWXY".split("");

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int b = n % 26;
            sb.insert(0, a[b]);
            n = (n - b) / 26;
            if (b == 0) {
                n -= 1;
            }
        }
        return sb.toString();
    }
}
