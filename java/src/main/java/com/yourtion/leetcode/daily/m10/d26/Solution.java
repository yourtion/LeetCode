package com.yourtion.leetcode.daily.m10.d26;

/**
 * 1365. 有多少小于当前数字的数字
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] map = new int[101];
        for (int v : nums) {
            map[v] += 1;
        }
        int sum = 0;
        for (int i = 0; i < map.length; i++) {
            int c = map[i];
            map[i] = sum;
            sum += c;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = map[nums[i]];
        }
        return nums;
    }
}
