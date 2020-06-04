package com.yourtion.leetcode.medium.c0075;

/**
 * 75. 颜色分类
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/sort-colors/
 */
public class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int cur = 0;
        while (cur <= j) {
            if (nums[cur] == 0) {
                int tmp = nums[i];
                nums[i++] = nums[cur];
                nums[cur++] = tmp;
            } else if (nums[cur] == 2) {
                int tmp = nums[cur];
                nums[cur] = nums[j];
                nums[j--] = tmp;
            } else {
                cur++;
            }
        }
    }
}
