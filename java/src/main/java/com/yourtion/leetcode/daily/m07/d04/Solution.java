package com.yourtion.leetcode.daily.m07.d04;

/**
 * 32. 最长有效括号
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/longest-valid-parentheses/
 */
public class Solution {
    public int longestValidParentheses(String s) {
        int ret = 0;
        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                ret = Math.max(ret, dp[i]);
            }
        }
        return ret;
    }
}
