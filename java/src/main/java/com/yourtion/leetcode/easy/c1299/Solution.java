package com.yourtion.leetcode.easy.c1299;

/**
 * 1299. 将每个元素替换为右侧最大元素
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side/
 */
public class Solution {
    public int[] replaceElements(int[] arr) {
        int cur = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int k = arr[i];
            arr[i] = cur;
            if (k > cur) {
                cur = k;
            }
        }
        return arr;
    }
}
