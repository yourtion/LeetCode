package com.yourtion.leetcode.easy.c1005;

import java.util.Arrays;

/**
 * 1005. K 次取反后最大化的数组和
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/maximize-sum-of-array-after-k-negations/
 */
public class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (K > 0 && A[i] < 0) {
                A[i] = -1 * A[i];
                K -= 1;
            }
        }
        if (K % 2 > 0) {
            Arrays.sort(A);
            A[0] = -1 * A[0];
        }
        int ret = 0;
        for (int i : A) {
            ret += i;
        }
        return ret;
    }
}
