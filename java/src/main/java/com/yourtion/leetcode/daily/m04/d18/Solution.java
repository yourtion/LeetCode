package com.yourtion.leetcode.daily.m04.d18;

/**
 * 11. 盛最多水的容器
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/container-with-most-water/
 */
public class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            } else {
                --r;
            }
        }
        return ans;
    }
}
