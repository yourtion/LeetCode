package com.yourtion.leetcode.daily.m03.d18;

/**
 * 836. 矩形重叠
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/rectangle-overlap/
 */
public class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean left = rec1[2] <= rec2[0];
        boolean bottom = rec1[3] <= rec2[1];
        boolean right = rec1[0] >= rec2[2];
        boolean top = rec1[1] >= rec2[3];
        return !(left || bottom || right || top);
    }
}
