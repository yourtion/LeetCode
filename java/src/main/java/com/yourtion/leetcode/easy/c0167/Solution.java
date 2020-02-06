package com.yourtion.leetcode.easy.c0167;

/**
 * 167. 两数之和 II - 输入有序数组
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        while (i < numbers.length) {
            int left = i;
            int right = numbers.length;
            if (target > numbers[i] + numbers[right - 1]) {
                i += 1;
                continue;
            }
            while (left < right) {
                int mid = (left + right) >>> 1;
                if (target - numbers[i] == numbers[mid]) {
                    return new int[]{i + 1, mid + 1};
                }
                if (numbers[mid] > target - numbers[i]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            i += 1;
        }
        return new int[]{-1, -1};
    }
}