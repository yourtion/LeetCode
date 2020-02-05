package com.yourtion.leetcode.easy.c0136;

/**
 * 136. 只出现一次的数字
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/single-number/
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int i = 0;
        int j = 1;
        while (i < nums.length - 1 && j < nums.length) {
            if (nums[i] == nums[j]) {
                nums[i] = 0;
                nums[j] = 0;
                i += 1;
                j = i + 1;
                continue;
            }
            j += 1;
        }
        for (int k : nums) {
            if (k != 0) {
                return k;
            }
        }
        return 0;
    }
}
