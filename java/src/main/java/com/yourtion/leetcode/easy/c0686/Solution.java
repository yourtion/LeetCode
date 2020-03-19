package com.yourtion.leetcode.easy.c0686;

/**
 * 686. 重复叠加字符串匹配
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/repeated-string-match/
 */
public class Solution {
    public int repeatedStringMatch(String A, String B) {
        int i = 1;
        StringBuilder s = new StringBuilder(A);
        while (s.length() < B.length()) {
            s.append(A);
            i++;
        }
        return s.lastIndexOf(B) == -1 ? ((s.append(A)).lastIndexOf(B) == -1 ? -1 : i + 1) : i;
    }
}
