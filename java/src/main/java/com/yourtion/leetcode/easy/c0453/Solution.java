package com.yourtion.leetcode.easy.c0453;

import java.util.Arrays;

/**
 * 453. 最小移动次数使数组元素相等
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements/
 */
public class Solution {

    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int ret = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            ret += nums[i] - nums[0];
        }
        return ret;
    }
}
