package com.yourtion.leetcode.daily.m03.d05;

/**
 * 1103. 分糖果 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/distribute-candies-to-people/
 */
public class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ret = new int[num_people];
        int i = 1;
        int j = 0;
        while (candies > 0) {
            if (candies > i) {
                ret[j] += i;
                candies -= i;
            } else {
                ret[j] += candies;
                candies = 0;
            }
            i++;
            j = j == num_people - 1 ? 0 : j + 1;
        }
        return ret;
    }
}
