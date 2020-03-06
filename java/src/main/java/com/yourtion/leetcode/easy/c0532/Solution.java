package com.yourtion.leetcode.easy.c0532;

import java.util.Arrays;

/**
 * 532. 数组中的K-diff数对
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/k-diff-pairs-in-an-array/
 */
public class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int ret = 0;
        int tmp = nums[0] - 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == tmp) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] > k) {
                    break;
                }
                if (nums[i] + k == nums[j]) {
                    ret += 1;
                    break;
                }
            }
            tmp = nums[i];
        }
        return ret;
    }
}
