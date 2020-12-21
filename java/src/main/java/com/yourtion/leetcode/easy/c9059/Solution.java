package com.yourtion.leetcode.easy.c9059;

/**
 * 9059. 面试题39. 数组中出现次数超过一半的数字
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int cur = nums[0];
        int count = 0;
        for (int n : nums) {
            if (n == cur) {
                count += 1;
            } else {
                count -= 1;
                if (count < 0) {
                    cur = n;
                    count = 1;
                }
            }
        }
        return cur;
    }
}
