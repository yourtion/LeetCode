package com.yourtion.leetcode.easy.c1464;

/**
 * 1464. 数组中两元素的最大乘积
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/maximum-product-of-two-elements-in-an-array/
 */
public class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max1Count = 0;
        int max2 = 0;
        for (int i : nums) {
            if (i == max1) {
                max1Count += 1;
                continue;
            }
            if (i > max1) {
                max2 = max1;
                max1 = i;
                max1Count = 1;
            } else if (i > max2) {
                max2 = i;
            }
        }
        return max1Count > 1 ? (max1 - 1) * (max1 - 1) : (max1 - 1) * (max2 - 1);
    }
}
