package com.yourtion.leetcode.easy.c0414;

import java.util.Arrays;

/**
 * 414. 第三大的数
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/third-maximum-number/
 */
public class Solution {

    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int i = 1;
        int cur = nums[nums.length - 1];
        for (int j = nums.length - 1; j > -1; j--) {
            if (nums[j] < cur) {
                cur = nums[j];
                i++;
            }
            if (i == 3) {
                break;
            }
        }
        return i == 3 ? cur : nums[nums.length - 1];
    }
}
