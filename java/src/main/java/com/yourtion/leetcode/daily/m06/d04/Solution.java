package com.yourtion.leetcode.daily.m06.d04;

/**
 * 238. 除自身以外数组的乘积
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/product-of-array-except-self/
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];
        int[] l = new int[n];
        l[0] = 1;
        int[] r = new int[n];
        r[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            l[i] = l[i - 1] * nums[i - 1];
            r[n - i - 1] = r[n - i] * nums[n - i];
        }
        for (int i = 0; i < n; i++) {
            ret[i] = l[i] * r[i];
        }
        return ret;
    }
}
