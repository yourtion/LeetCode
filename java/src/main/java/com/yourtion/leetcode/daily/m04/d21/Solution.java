package com.yourtion.leetcode.daily.m04.d21;

/**
 * 1248. 统计「优美子数组」
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/count-number-of-nice-subarrays/
 */
public class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] odd = new int[n + 2];
        int ans = 0, cnt = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] % 2 == 1) {
                odd[++cnt] = i;
            }
        }
        odd[0] = -1;
        odd[++cnt] = n;
        for (int i = 1; i + k <= cnt; ++i) {
            ans += (odd[i] - odd[i - 1]) * (odd[i + k] - odd[i + k - 1]);
        }
        return ans;
    }
}
