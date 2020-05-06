package com.yourtion.leetcode.easy.c1403;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1403. 非递增顺序的最小子序列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/minimum-subsequence-in-non-increasing-order/
 */
public class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ret = new ArrayList<>();
        int e = 0;
        int b = 0;
        int i = 0;
        int pos = nums.length - 1;
        Arrays.sort(nums);
        while (i <= pos) {
            if (e > b || e + nums[i] >= b) {
                b += nums[pos];
                ret.add(nums[pos]);
                pos -= 1;
            } else {
                e += nums[i++];
            }
        }
        return ret;
    }
}
