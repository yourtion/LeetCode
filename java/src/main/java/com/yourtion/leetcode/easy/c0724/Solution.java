package com.yourtion.leetcode.easy.c0724;

/**
 * 724. 寻找数组的中心索引
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/find-pivot-index/
 */
public class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x : nums) {
            sum += x;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}
