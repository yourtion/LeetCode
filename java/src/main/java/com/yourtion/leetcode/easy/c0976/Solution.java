package com.yourtion.leetcode.easy.c0976;

import java.util.Arrays;

/**
 * 976. 三角形的最大周长
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/largest-perimeter-triangle/
 */
public class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int index = A.length - 1;
        while (index > 1) {
            int a = A[index];
            int b = A[index - 1];
            int c = A[index - 2];
            if (a < b + c) {
                return a + b + c;
            }
            index -= 1;
        }
        return 0;
    }
}
