package com.yourtion.leetcode.daily.m06.d11;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 739. 每日温度
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/daily-temperatures/
 */
public class Solution {
    public int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] ans = new int[length];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            int temperature = T[i];
            while (!stack.isEmpty() && temperature > T[stack.peek()]) {
                int prevIndex = stack.pop();
                ans[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return ans;
    }
}
