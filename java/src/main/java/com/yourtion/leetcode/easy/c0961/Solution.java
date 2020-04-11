package com.yourtion.leetcode.easy.c0961;

import java.util.Arrays;

/**
 * 961. 重复 N 次的元素
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/n-repeated-element-in-size-2n-array/
 */
public class Solution {
    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        return A[A.length / 2 + 1] == A[A.length / 2] ? A[A.length / 2 + 1] : A[A.length / 2 - 1];
    }
}
