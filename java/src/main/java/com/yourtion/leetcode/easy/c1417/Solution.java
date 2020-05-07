package com.yourtion.leetcode.easy.c1417;

/**
 * 1417. 重新格式化字符串
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/reformat-the-string/
 */
public class Solution {
    public String reformat(String s) {
        int[] mapA = new int[26];
        int[] mapN = new int[26];
        int na = 0;
        int nn = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                mapN[c - '0'] += 1;
                nn += 1;
            }
            if (Character.isLetter(c)) {
                mapA[c - 'a'] += 1;
                na += 1;
            }
        }
        // 如果数量相差超过1，则无法满足条件
        if (Math.abs(na - nn) > 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (nn > 0 || na > 0) {
            if (i < 26 && mapA[i] == 0) {
                i += 1;
                continue;
            }
            if (j < 10 && mapN[j] == 0) {
                j += 1;
                continue;
            }
            // 先处理字母多于数字的情况，把长度补齐
            if (na > nn) {
                sb.append((char) (i + 'a'));
                na -= 1;
                mapA[i] -= 1;
                continue;
            }
            // 填充数字
            sb.append((char) (j + '0'));
            nn -= 1;
            mapN[j] -= 1;
            // 填充字母
            if (na > 0) {
                sb.append((char) (i + 'a'));
                na -= 1;
                mapA[i] -= 1;
            }
        }
        return sb.toString();
    }
}
