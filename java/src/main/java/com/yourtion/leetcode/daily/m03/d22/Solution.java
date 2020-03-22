package com.yourtion.leetcode.daily.m03.d22;

/**
 * 945. 使数组唯一的最小增量
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/minimum-increment-to-make-array-unique/
 */
public class Solution {
    public int minIncrementForUnique(int[] A) {
        int[] count = new int[80000];
        for (int x : A) {
            count[x]++;
        }

        int ans = 0, taken = 0;

        for (int x = 0; x < 80000; ++x) {
            if (count[x] >= 2) {
                taken += count[x] - 1;
                ans -= x * (count[x] - 1);
            } else if (taken > 0 && count[x] == 0) {
                taken--;
                ans += x;
            }
        }

        return ans;
    }
}
