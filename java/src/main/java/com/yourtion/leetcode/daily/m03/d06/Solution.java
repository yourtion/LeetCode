package com.yourtion.leetcode.daily.m03.d06;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题57 - II. 和为s的连续正数序列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/
 */
public class Solution {
    public int[][] findContinuousSequence(int target) {
        List<List<Integer>> list = new ArrayList<>();
        int start = 1;
        while (start <= target / 2) {
            List<Integer> ll = new ArrayList<>();
            int sum = 0;
            for (int i = start; sum < target; i++) {
                sum += i;
                ll.add(i);
            }
            if (ll.size() > 1 && sum == target) {
                list.add(ll);
            }
            start += 1;
        }
        int[][] ret = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            List<Integer> l = list.get(i);
            ret[i] = new int[l.size()];
            for (int j = 0; j < l.size(); j++) {
                ret[i][j] = l.get(j);
            }
        }
        return ret;
    }
}
