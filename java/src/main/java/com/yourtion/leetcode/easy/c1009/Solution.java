package com.yourtion.leetcode.easy.c1009;

/**
 * 1009. 十进制整数的反码
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/complement-of-base-10-integer/
 */
public class Solution {
    public int bitwiseComplement(int N) {
        char[] arr = Integer.toBinaryString(N).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == '0' ? '1' : '0';
        }
        return Integer.parseInt(new String(arr), 2);
    }
}
