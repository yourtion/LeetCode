package com.yourtion.leetcode.daily.m03.d03;

import java.util.Arrays;

/**
 * 面试题 10.01. 合并排序的数组
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/sorted-merge-lcci/
 */
public class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        System.arraycopy(B, 0, A, m, n);
        Arrays.sort(A);
    }
}
