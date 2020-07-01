package com.yourtion.leetcode.daily.m07.d01;

/**
 * 718. 最长重复子数组
 *
 * @author Yourtion
 * https://leetcode-cn.com/problems/maximum-length-of-repeated-subarray/
 */
public class Solution {
    public int findLength(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int[][] dp = new int[n + 1][m + 1];
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                dp[i][j] = A[i] == B[j] ? dp[i + 1][j + 1] + 1 : 0;
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }
}
