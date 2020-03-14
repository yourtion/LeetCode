package com.yourtion.leetcode.easy.c0628;

import java.util.Arrays;

/**
 * 628. 三个数的最大乘积
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/maximum-product-of-three-numbers/
 */
public class Solution {
    public int maximumProduct(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int r = nums.length;
        if (nums[0] < 0 && nums[1] < 0) {
            if (nums[0] * nums[1] > nums[r - 3] * nums[r - 2]) {
                return nums[0] * nums[1] * nums[r - 1];
            }
        }
        return nums[r - 1] * nums[r - 2] * nums[r - 3];
    }
}
