package com.yourtion.leetcode.easy.c1021;

/**
 * 1021. 删除最外层的括号
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/remove-outermost-parentheses/
 */
public class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder(S);
        int c = 0;
        int d = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                c += 1;
                if (c == 1) {
                    sb.deleteCharAt(i - d);
                    d += 1;
                }
            }
            if (S.charAt(i) == ')') {
                c -= 1;
                if (c == 0) {
                    sb.deleteCharAt(i - d);
                    d += 1;
                }
            }
        }
        return sb.toString();
    }
}
