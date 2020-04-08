package com.yourtion.leetcode.easy.c0922;

/**
 * 922. 按奇偶排序数组 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/sort-array-by-parity-ii/
 */
public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int a = 0;
        int b = 1;
        while (a < A.length || b < A.length) {
            if (a < A.length && A[a] % 2 == 0) {
                a += 2;
                continue;
            }
            if (b < A.length && A[b] % 2 == 1) {
                b += 2;
                continue;
            }
            int tmp = A[a];
            A[a] = A[b];
            A[b] = tmp;
        }
        return A;
    }
}
