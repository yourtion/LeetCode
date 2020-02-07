package com.yourtion.leetcode.easy.c0171;

/**
 * 171. Excel表列序号
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/excel-sheet-column-number/
 */
public class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        int k = 1;
        int i = s.length() - 1;
        while (i >= 0) {
            int n = s.charAt(i) - 'A';
            int b = n >= 26 ? 0 : 1;
            res += (n + b) * k;
            k *= 26;
            i -= 1;
        }
        return res;
    }
}
