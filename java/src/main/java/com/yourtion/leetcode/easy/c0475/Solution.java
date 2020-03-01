package com.yourtion.leetcode.easy.c0475;

import java.util.Arrays;

/**
 * 475. 供暖器
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/heaters/
 */
public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int max = 0;
        int temp = 0;
        int i = 0, j = 0;
        while (i < houses.length && j < heaters.length) {
            if (houses[i] <= heaters[j]) {
                temp = heaters[j] - houses[i];
                i++;
            } else if (j < heaters.length - 1) {
                temp = Math.min(heaters[j + 1] - houses[i], houses[i] - heaters[j]);
                if (houses[i] < heaters[j + 1]) {
                    i++;
                } else {
                    j++;
                }
            } else if (j == heaters.length - 1) {
                temp = houses[i] - heaters[j];
                i++;
            }
            max = Math.max(max, temp);
        }
        return max;
    }
}
