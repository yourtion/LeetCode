package com.yourtion.leetcode.easy.c0191;

/**
 * 191. 位1的个数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/number-of-1-bits/
 */
public class Solution {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                res += 1;
            }
        }
        return res;
    }
}
