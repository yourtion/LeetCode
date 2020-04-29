package com.yourtion.leetcode.easy.c1295;

/**
 * 1295. 统计位数为偶数的数字
 *
 * @author Yourtion
 * @link
 */
public class Solution {
    public int findNumbers(int[] nums) {
        int ret = 0;
        for (int a : nums) {
            if (String.valueOf(a).length() % 2 == 0) {
                ret += 1;
            }
        }
        return ret;
    }
}
