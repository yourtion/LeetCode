package com.yourtion.leetcode.easy.c0717;

/**
 * 717. 1比特与2比特字符
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/1-bit-and-2-bit-characters/
 */
public class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }
}
