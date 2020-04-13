package com.yourtion.leetcode.easy.c0985;

/**
 * 985. 查询后的偶数和
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/sum-of-even-numbers-after-queries/
 */
public class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] ret = new int[queries.length];
        int sum = 0;
        for (int t : A) {
            if (t % 2 == 0) {
                sum += t;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int[] q = queries[i];
            int a = q[0];
            int b = q[1];
            int tmp = A[b];
            boolean change1 = A[b] % 2 == 0;
            A[b] += a;
            boolean change2 = A[b] % 2 == 0;
            if (change1 || change2) {
                sum = change1 ? sum - tmp : sum;
                sum = change2 ? sum + A[b] : sum;
            }
            ret[i] = sum;
        }
        return ret;
    }
}
