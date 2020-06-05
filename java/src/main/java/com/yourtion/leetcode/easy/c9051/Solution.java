package com.yourtion.leetcode.easy.c9051;

/**
 * 9051. 面试题21. 调整数组顺序使奇数位于偶数前面
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 */
public class Solution {
    public int[] exchange(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] % 2 == 1) {
                i++;
                continue;
            }
            if (nums[j] % 2 == 0) {
                j--;
                continue;
            }
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}
