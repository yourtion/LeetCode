package com.yourtion.leetcode.easy.c0575;

/**
 * 575. 分糖果
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/distribute-candies/
 */
public class Solution {
    public int distributeCandies(int[] candies) {
        boolean[] table = new boolean[200001];
        int count = 0;
        for (int i : candies) {
            count = table[i + 100000] ? count : count + 1;
            table[i + 100000] = true;
        }
        return Math.min(count, candies.length / 2);
    }
}
