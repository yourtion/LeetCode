package com.yourtion.leetcode.daily.m05.d06;

import java.util.HashSet;
import java.util.Set;

/**
 * 983. 最低票价
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/minimum-cost-for-tickets/
 */
public class Solution {
    private int[] cs;
    private Integer[] memo;
    private Set<Integer> daySet;

    public int mincostTickets(int[] days, int[] costs) {
        cs = costs;
        memo = new Integer[366];
        daySet = new HashSet<>();
        for (int d : days) {
            daySet.add(d);
        }
        return dp(1);
    }

    private int dp(int i) {
        if (i > 365) {
            return 0;
        }
        if (memo[i] != null) {
            return memo[i];
        }
        if (daySet.contains(i)) {
            memo[i] = Math.min(Math.min(dp(i + 1) + cs[0], dp(i + 7) + cs[1]), dp(i + 30) + cs[2]);
        } else {
            memo[i] = dp(i + 1);
        }
        return memo[i];
    }
}
