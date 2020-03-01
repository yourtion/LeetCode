package com.yourtion.leetcode.easy.c0476;

/**
 * 476. 数字的补数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/number-complement/
 */
public class Solution {
    public int findComplement(int num) {
        int result = 0;
        int temp = 1;

        while (num > 0) {
            //遇到为0的位 我们就要置1
            if ((num & 1) == 0) {
                result = result | temp;
            }
            // 让temp去移动可能要变更的位
            temp <<= 1;
            num >>= 1;
        }
        return result;
    }
}
