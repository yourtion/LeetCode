package com.yourtion.leetcode.easy.c0026;

/**
 * 26. 删除排序数组中的重复项
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int cNum = nums[0];
        int ret = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != cNum) {
                nums[ret] = nums[i];
                cNum = nums[i];
                ret += 1;
            }
        }
        return ret;
    }
}
