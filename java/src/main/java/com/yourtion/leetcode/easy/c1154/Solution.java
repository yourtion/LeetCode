package com.yourtion.leetcode.easy.c1154;

/**
 * 1154. 一年中的第几天
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/day-of-the-year/
 */
public class Solution {
    private int[] md = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int dayOfYear(String date) {
        String[] sp = date.split("-");
        int year = Integer.parseInt(sp[0]);
        int month = Integer.parseInt(sp[1]);
        int day = Integer.parseInt(sp[2]);
        int ret = 0;
        if (month > 2) {
            if (year % 100 == 0) {
                ret = year % 400 == 0 ? 1 : 0;
            } else if (year % 4 == 0) {
                ret = 1;
            }
        }
        while (month > 0) {
            ret += md[--month];
        }
        ret += day;
        return ret;
    }
}
