package com.yourtion.leetcode.daily.m08.d25;

import java.util.ArrayList;
import java.util.List;

/**
 * 491. 递增子序列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/increasing-subsequences/
 */
public class Solution {
    private final List<Integer> temp = new ArrayList<>();
    private final List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        dfs(0, Integer.MIN_VALUE, nums);
        return ans;
    }

    private void dfs(int cur, int last, int[] nums) {
        if (cur == nums.length) {
            if (temp.size() >= 2) {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if (nums[cur] >= last) {
            temp.add(nums[cur]);
            dfs(cur + 1, nums[cur], nums);
            temp.remove(temp.size() - 1);
        }
        if (nums[cur] != last) {
            dfs(cur + 1, last, nums);
        }
    }
}
