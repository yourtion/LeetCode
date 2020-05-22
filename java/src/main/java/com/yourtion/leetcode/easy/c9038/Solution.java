package com.yourtion.leetcode.easy.c9038;

/**
 * 9038. 面试题 17.10. 主要元素
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/find-majority-element-lcci/
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int tmp = nums[0];
        int count = 0;
        for (int num : nums) {
            if (num == tmp) {
                count += 1;
            } else {
                count -= 1;
                if (count <= 0) {
                    tmp = num;
                    count = 1;
                }
            }
        }
        count = 0;
        for (int num : nums) {
            if (num == tmp) {
                count += 1;
            }
        }
        return count >= nums.length / 2 + 1 ? tmp : -1;
    }
}
