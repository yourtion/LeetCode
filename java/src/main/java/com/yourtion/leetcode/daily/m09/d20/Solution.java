package com.yourtion.leetcode.daily.m09.d20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 78. 子集
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/subsets/
 */
public class Solution {
    private final List<List<Integer>> ret = new LinkedList<>();

    private void backtrace(LinkedList<Integer> list, int[] nums, int k) {
        ret.add(new ArrayList<>(list));
        for (int i = k; i < nums.length; i++) {
            list.add(nums[i]);
            backtrace(list, nums, i + 1);
            list.removeLast();
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        backtrace(new LinkedList<>(), nums, 0);
        return ret;
    }
}
