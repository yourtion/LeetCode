package com.yourtion.leetcode.medium.c0062;

import java.util.Arrays;

/**
 * 62. 不同路径
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/unique-paths/
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        int[] cur = new int[n];
        Arrays.fill(cur, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                cur[j] += cur[j - 1];
            }
        }
        return cur[n - 1];
    }
}
