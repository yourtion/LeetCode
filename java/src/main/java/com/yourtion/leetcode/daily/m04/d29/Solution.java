package com.yourtion.leetcode.daily.m04.d29;

/**
 * 1095. 山脉数组中查找目标值
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/find-in-mountain-array/
 */
public class Solution {

    private int binarySearchLeft(int target, int left, int right, MountainArray mountainArr) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == mountainArr.get(mid)) {
                return mid;
            } else if (target < mountainArr.get(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private int binarySearchRight(int target, int left, int right, MountainArray mountainArr) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == mountainArr.get(mid)) {
                return mid;
            } else if (target < mountainArr.get(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int l = 0, r = mountainArr.length() - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        int peak = l;
        int leftRes = binarySearchLeft(target, 0, peak, mountainArr);
        if (leftRes != -1) {
            return leftRes;
        }
        // 左半边搜不到，再看右半边
        return binarySearchRight(target, peak + 1, mountainArr.length() - 1, mountainArr);
    }

    interface MountainArray {
        /**
         * 返回数组中索引为 index 的元素（下标从 0 开始）
         *
         * @param index 索引
         * @return 元素
         */
        int get(int index);

        /**
         * 该数组的长度
         *
         * @return 长度
         */
        int length();
    }
}
