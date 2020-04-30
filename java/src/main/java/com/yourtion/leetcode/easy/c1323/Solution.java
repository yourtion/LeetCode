package com.yourtion.leetcode.easy.c1323;

/**
 * 1323. 6 和 9 组成的最大数字
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/maximum-69-number/
 */
public class Solution {
    public int maximum69Number(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '6') {
                arr[i] = '9';
                return Integer.parseInt(new String(arr));
            }
        }
        return num;
    }
}
