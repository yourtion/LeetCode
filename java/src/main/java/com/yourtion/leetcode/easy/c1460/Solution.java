package com.yourtion.leetcode.easy.c1460;

/**
 * 1460. 通过翻转子数组使两个数组相等
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
 */
public class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }
        int[] map = new int[1001];
        for (int i = 0; i < target.length; i++) {
            map[target[i]] += 1;
            map[arr[i]] -= 1;
        }
        for (int i : map) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
