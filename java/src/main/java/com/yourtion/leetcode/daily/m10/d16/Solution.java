package com.yourtion.leetcode.daily.m10.d16;

import java.util.Arrays;

/**
 * 977. 有序数组的平方
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 */
public class Solution {
    public int[] sortedSquares(int[] A) {
        return Arrays.stream(A).map(a -> a * a).sorted().toArray();
    }
}
