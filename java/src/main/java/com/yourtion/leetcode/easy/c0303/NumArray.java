package com.yourtion.leetcode.easy.c0303;

/**
 * 303. 区域和检索 - 数组不可变
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/range-sum-query-immutable/
 */
public class NumArray {
    private int[] arr;

    public NumArray(int[] nums) {
        arr = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for (int a = i; a <= j; a++) {
            sum += arr[a];
        }
        return sum;
    }
}
