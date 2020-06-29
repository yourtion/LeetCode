package com.yourtion.leetcode.daily.m06.d29;

import java.util.Arrays;

/**
 * 215. 数组中的第K个最大元素
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
