package com.yourtion.leetcode.easy.c1287;

/**
 * 1287. 有序数组中出现次数超过25%的元素
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/element-appearing-more-than-25-in-sorted-array/
 */
public class Solution {
    public int findSpecialInteger(int[] arr) {
        int c = 0;
        int d = arr[0];
        int n = arr.length / 4 + 1;
        for (int a : arr) {
            if (a == d) {
                c += 1;
                if (c == n) {
                    return a;
                }
            } else {
                c = 1;
                d = a;
            }
        }
        return d;
    }
}
