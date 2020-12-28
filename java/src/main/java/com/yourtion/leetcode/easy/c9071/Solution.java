package com.yourtion.leetcode.easy.c9071;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/**
 * 9071. 面试题 59 - I. 滑动窗口的最大值
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/
 */
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || nums.length < k) {
            return new int[0];
        }
        if (k == 1) {
            return nums;
        }
        Deque<Integer> deque = new ArrayDeque<>(k);
        int[] ret = new int[nums.length - k + 1];
        int max = -1;
        for (int i = 0; i < k; i++) {
            max = Math.max(max, nums[i]);
            deque.addFirst(nums[i]);
        }
        ret[0] = max;
        for (int i = k; i < nums.length; i++) {
            int f = deque.removeLast();
            if (f == max) {
                max = deque.stream().max(Comparator.naturalOrder()).orElse(nums[i]);
            }
            max = Math.max(max, nums[i]);
            deque.addFirst(nums[i]);
            ret[i - k + 1] = max;
        }
        return ret;
    }
}
