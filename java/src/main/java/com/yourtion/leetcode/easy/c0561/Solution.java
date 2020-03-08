package com.yourtion.leetcode.easy.c0561;

import java.util.Arrays;

/**
 * 561. 数组拆分 I
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/array-partition-i/
 */
public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ret = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            ret += nums[i];
        }
        return ret;
    }
}
