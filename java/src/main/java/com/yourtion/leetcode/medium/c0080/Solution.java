package com.yourtion.leetcode.medium.c0080;

/**
 * 80. 删除排序数组中的重复项 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int n = nums[0] - 1;
        int pos = 0;
        int cur = 0;
        int c = 0;
        while (pos < nums.length) {
            if (nums[pos] == n && c == 2) {
                pos += 1;
                continue;
            }
            nums[cur++] = nums[pos];
            if (cur == 0 || n != nums[cur - 1]) {
                n = nums[pos];
                c = 0;
            }
            pos += 1;
            c += 1;
        }
        return cur;
    }
}
