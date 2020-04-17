package com.yourtion.leetcode.easy.c1029;

import java.util.Arrays;

/**
 * 1029. 两地调度
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/two-city-scheduling/
 */
public class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int sum = 0;
        Arrays.sort(costs, (o1, o2) -> o1[0] - o1[1] - (o2[0] - o2[1]));
        int n = costs.length / 2;
        for (int i = 0; i < n; ++i) {
            sum += costs[i][0] + costs[i + n][1];
        }
        return sum;

    }
}
