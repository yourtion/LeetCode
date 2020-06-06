package com.yourtion.leetcode.daily.m06.d06;

import java.util.HashSet;
import java.util.Set;

/**
 * 128. 最长连续序列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/longest-consecutive-sequence/
 */
public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int res = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                res = Math.max(res, currentStreak);
            }
        }
        return res;
    }
}
