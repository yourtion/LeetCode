package com.yourtion.leetcode.daily.m04.d11;

/**
 * 887. 鸡蛋掉落
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/super-egg-drop/
 */
public class Solution {
    public int superEggDrop(int K, int N) {
        if (N == 1) {
            return 1;
        }
        int[][] f = new int[N + 1][K + 1];
        for (int i = 1; i <= K; ++i) {
            f[1][i] = 1;
        }
        int ans = -1;
        for (int i = 2; i <= N; ++i) {
            for (int j = 1; j <= K; ++j) {
                f[i][j] = 1 + f[i - 1][j - 1] + f[i - 1][j];
            }
            if (f[i][K] >= N) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
