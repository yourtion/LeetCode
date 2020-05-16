package com.yourtion.leetcode.easy.c9022;

/**
 * 9022. 面试题 05.06. 整数转换
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/convert-integer-lcci/
 */
public class Solution {
    public int convertInteger(int A, int B) {
        int temp = A ^ B;
        int count = 0;
        while (temp != 0) {
            // 去掉二进制表示的最右边的1
            temp &= (temp - 1);
            count++;
        }
        return count;
    }
}
