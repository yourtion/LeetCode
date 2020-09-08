package com.yourtion.leetcode.daily.m09.d08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 77. 组合
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/combinations/
 */
public class Solution {
    private final List<List<Integer>> ret = new LinkedList<>();

    private void backtrace(LinkedList<Integer> list, int n, int k) {
        if (list.size() == k) {
            ret.add(new ArrayList<>(list));
            return;
        }
        int s = list.size();
        for (int i = s + 1; i <= n - (k - list.size()) + 1; i++) {
            if (s > 0 && i <= list.get(s - 1)) {
                continue;
            }
            list.add(i);
            backtrace(list, n, k);
            list.removeLast();
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        backtrace(new LinkedList<>(), n, k);
        return ret;
    }
}
