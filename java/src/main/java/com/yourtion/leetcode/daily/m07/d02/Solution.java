package com.yourtion.leetcode.daily.m07.d02;

import java.util.Arrays;

/**
 * @author Yourtion
 */
public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] arr = new int[n * n];
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, arr, i * n, matrix[i].length);
        }
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
