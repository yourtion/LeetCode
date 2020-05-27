package com.yourtion.leetcode.easy.c9047;

/**
 * 9047. 面试题11. 旋转数组的最小数字
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 */
public class Solution {
    public int minArray(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            if (numbers[i] < numbers[i - 1]) {
                return numbers[i];
            }
        }
        return numbers[0];
    }
}
