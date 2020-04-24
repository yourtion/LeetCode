package com.yourtion.leetcode.daily.m04.d24;

/**
 * 面试题51. 数组中的逆序对
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof/
 */
public class Solution {
    private int mergeSort(int[] nums, int[] tmp, int l, int r) {
        if (l >= r) {
            return 0;
        }

        int mid = (l + r) / 2;
        int inv_count = mergeSort(nums, tmp, l, mid) + mergeSort(nums, tmp, mid + 1, r);
        int i = l, j = mid + 1, pos = l;
        while (i <= mid && j <= r) {
            if (nums[i] <= nums[j]) {
                tmp[pos] = nums[i];
                ++i;
                inv_count += (j - (mid + 1));
            } else {
                tmp[pos] = nums[j];
                ++j;
            }
            ++pos;
        }
        for (int k = i; k <= mid; ++k) {
            tmp[pos++] = nums[k];
            inv_count += (j - (mid + 1));
        }
        for (int k = j; k <= r; ++k) {
            tmp[pos++] = nums[k];
        }
        // copy(tmp.begin() + l, tmp.begin() + r + 1, nums.begin() + l);
        System.arraycopy(tmp, l, nums, l, r - l + 1);
        return inv_count;
    }

    public int reversePairs(int[] nums) {
        int[] tmp = new int[nums.length];
        return mergeSort(nums, tmp, 0, nums.length - 1);
    }
}
