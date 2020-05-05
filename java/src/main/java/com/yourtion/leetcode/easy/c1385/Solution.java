package com.yourtion.leetcode.easy.c1385;

/**
 * 1385. 两个数组间的距离值
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/find-the-distance-value-between-two-arrays/
 */
public class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ret = 0;
        for (int a : arr1) {
            boolean ok = true;
            for (int b : arr2) {
                if (Math.abs(a - b) <= d) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                ret += 1;
            }
        }
        return ret;
    }
}
