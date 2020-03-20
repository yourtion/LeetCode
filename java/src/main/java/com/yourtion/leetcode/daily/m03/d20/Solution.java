package com.yourtion.leetcode.daily.m03.d20;

import java.util.Arrays;

/**
 * 面试题40. 最小的k个数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 */
public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOf(arr, k);
    }
}
