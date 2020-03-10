package com.yourtion.leetcode.easy.c0581;

import java.util.Arrays;

/**
 * 581. 最短无序连续子数组
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray/
 */
public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);
        int c = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == sorted[i]) {
                c--;
            } else {
                break;
            }
        }
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == sorted[i]) {
                c--;
            } else {
                break;
            }
        }
        return Math.max(c, 0);
    }
}
