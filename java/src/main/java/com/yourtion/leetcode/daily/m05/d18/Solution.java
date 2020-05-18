package com.yourtion.leetcode.daily.m05.d18;

/**
 * 152. 乘积最大子数组
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/maximum-product-subarray/
 */
public class Solution {
    public int maxProduct(int[] nums) {
        int ret = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int c = 1;
            for (int j = i; j < nums.length; j++) {
                c *= nums[j];
                ret = Math.max(ret, c);
            }
        }
        return ret;
    }
}
