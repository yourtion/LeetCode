package com.yourtion.leetcode.easy.c0868;

/**
 * 868. 二进制间距
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/binary-gap/
 */
public class Solution {
    public int binaryGap(int N) {
        char[] s = Integer.toBinaryString(N).toCharArray();
        int ret = 0;
        int index = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '1') {
                ret = Math.max(ret, i - index);
                index = i;
            }
        }
        return ret;
    }
}
