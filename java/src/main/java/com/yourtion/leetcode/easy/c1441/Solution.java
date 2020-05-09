package com.yourtion.leetcode.easy.c1441;

/**
 * 1441. LCP 02. 分式化简
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/deep-dark-fraction/
 */
public class Solution {
    private int[] recursive(int[] count, int index) {
        if (index == count.length - 1) {
            return new int[]{count[index], 1};
        }
        int[] nextRes = recursive(count, index + 1);
        return new int[]{count[index] * nextRes[0] + nextRes[1], nextRes[0]};
    }

    public int[] fraction(int[] cont) {
        return recursive(cont, 0);
    }
}
