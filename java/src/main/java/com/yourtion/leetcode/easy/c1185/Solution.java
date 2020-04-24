package com.yourtion.leetcode.easy.c1185;

/**
 * 1185. 一周中的第几天
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/day-of-the-week/
 */
public class Solution {
    private static final String[] WEEK = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    private int dayOfYear(int day, int month, int year) {
        boolean is29 = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        switch (month) {
            case 1:
                return day;
            case 2:
                return 31 + day;
            case 3:
                return is29 ? 60 + day : 59 + day;
            case 4:
                return is29 ? 91 + day : 90 + day;
            case 5:
                return is29 ? 121 + day : 120 + day;
            case 6:
                return is29 ? 152 + day : 151 + day;
            case 7:
                return is29 ? 182 + day : 181 + day;
            case 8:
                return is29 ? 213 + day : 212 + day;
            case 9:
                return is29 ? 244 + day : 243 + day;
            case 10:
                return is29 ? 274 + day : 273 + day;
            case 11:
                return is29 ? 305 + day : 304 + day;
            case 12:
                return is29 ? 335 + day : 334 + day;
            default:
                return 0;
        }
    }

    public String dayOfTheWeek(int day, int month, int year) {
        int sum = 4;
        for (int i = 1971; i < year; i++) {
            sum += dayOfYear(31, 12, i);
        }
        sum += dayOfYear(day, month, year);
        return WEEK[sum % 7];
    }
}
