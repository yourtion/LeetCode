package com.yourtion.leetcode.easy.c0905;

/**
 * 905. 按奇偶排序数组
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/sort-array-by-parity/
 */
public class Solution {
    public int[] sortArrayByParity(int[] A) {
        int a = 0;
        int b = A.length - 1;
        while (a < b) {
            if (A[a] % 2 == 0) {
                a++;
                continue;
            }
            if (A[b] % 2 == 1) {
                b--;
                continue;
            }
            int tmp = A[a];
            A[a] = A[b];
            A[b] = tmp;
        }
        return A;
    }
}
