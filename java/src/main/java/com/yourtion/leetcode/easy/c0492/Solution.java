package com.yourtion.leetcode.easy.c0492;

/**
 * 492. 构造矩形
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/construct-the-rectangle/
 */
public class Solution {
    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        if (w * w == area) {
            return new int[]{w, w};
        }
        while (area % w != 0) {
            w -= 1;
        }
        return new int[]{area / w, w};
    }
}
