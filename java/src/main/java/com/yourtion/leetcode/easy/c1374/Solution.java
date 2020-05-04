package com.yourtion.leetcode.easy.c1374;

import java.util.Arrays;

/**
 * 1374. 生成每种字符都是奇数个的字符串
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/generate-a-string-with-characters-that-have-odd-counts/
 */
public class Solution {
    public String generateTheString(int n) {
        char[] arr = new char[n];
        Arrays.fill(arr, 'a');
        if (n % 2 == 0) {
            arr[0] = 'b';
        }
        return new String(arr);
    }
}
