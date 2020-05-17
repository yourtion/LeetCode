package com.yourtion.leetcode.easy.c9023;

/**
 * 9023. 面试题 05.07. 配对交换
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/exchange-lcci/
 */
public class Solution {
    public int exchangeBits(int num) {
        // 奇数 0x55555555 = 0b0101_0101_0101_0101_0101_0101_0101_0101
        int odd = num & 0x55555555;
        // 偶数 0xaaaaaaaa = 0b1010_1010_1010_1010_1010_1010_1010_1010
        int even = num & 0xaaaaaaaa;
        odd = odd << 1;
        even = even >>> 1;
        return odd | even;
    }
}
