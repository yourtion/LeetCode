package com.yourtion.leetcode.medium.c0090;

import java.util.*;

/**
 * 90. 子集 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/subsets-ii/
 */
public class Solution {
    private Set<List<Integer>> ret = new HashSet<>();

    private void backtrace(LinkedList<Integer> list, int[] nums, int k) {
        ret.add(new ArrayList<>(list));
        for (int i = k; i < nums.length; i++) {
            list.add(nums[i]);
            backtrace(list, nums, i + 1);
            list.removeLast();
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrace(new LinkedList<>(), nums, 0);
        return new ArrayList<>(ret);
    }
}
