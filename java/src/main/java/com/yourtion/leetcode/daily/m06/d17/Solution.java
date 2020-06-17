package com.yourtion.leetcode.daily.m06.d17;

/**
 * 1014. 最佳观光组合
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/best-sightseeing-pair/
 */
public class Solution {
    public int maxScoreSightseeingPair(int[] A) {
        int ret = 0;
        int max = A[0];
        for (int j = 1; j < A.length; ++j) {
            ret = Math.max(ret, max + A[j] - j);
            // 边遍历边维护
            max = Math.max(max, A[j] + j);
        }
        return ret;
    }
}
