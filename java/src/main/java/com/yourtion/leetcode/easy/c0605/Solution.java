package com.yourtion.leetcode.easy.c0605;

/**
 * 605. 种花问题
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/can-place-flowers/
 */
public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int ret = 0;
        boolean flag = true;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (flag && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    flag = false;
                    ret += 1;
                } else {
                    flag = true;
                }
            } else {
                flag = false;
            }
        }
        return ret >= n;
    }
}
