package com.yourtion.leetcode.daily.m11.d25;

import java.util.Arrays;

/**
 * 1370. 上升下降字符串
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/increasing-decreasing-string/
 */
public class Solution {
    public String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int k = 0;
        char cur;
        while (k < arr.length) {
            cur = 'A';
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 'A' || arr[i] == cur) {
                    continue;
                }
                cur = arr[i];
                k += 1;
                sb.append(cur);
                arr[i] = 'A';
            }
            cur = 'A';
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i] == 'A' || arr[i] == cur) {
                    continue;
                }
                cur = arr[i];
                k += 1;
                sb.append(cur);
                arr[i] = 'A';
            }
        }
        return sb.toString();
    }
}
