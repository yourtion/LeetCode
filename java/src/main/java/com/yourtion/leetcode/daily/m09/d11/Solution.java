package com.yourtion.leetcode.daily.m09.d11;

import java.util.ArrayList;
import java.util.List;

/**
 * 216. 组合总和 III
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/combination-sum-iii/
 */
public class Solution {
    private final List<Integer> temp = new ArrayList<>();
    private final List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(1, 9, k, n);
        return ans;
    }

    private void dfs(int cur, int n, int k, int sum) {
        if (temp.size() + (n - cur + 1) < k || temp.size() > k) {
            return;
        }
        if (temp.size() == k) {
            int tempSum = 0;
            for (int num : temp) {
                tempSum += num;
            }
            if (tempSum == sum) {
                ans.add(new ArrayList<>(temp));
                return;
            }
        }
        temp.add(cur);
        dfs(cur + 1, n, k, sum);
        temp.remove(temp.size() - 1);
        dfs(cur + 1, n, k, sum);
    }
}
