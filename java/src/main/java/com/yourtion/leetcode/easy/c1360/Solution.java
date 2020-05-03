package com.yourtion.leetcode.easy.c1360;

/**
 * 1360. 日期之间隔几天
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/number-of-days-between-two-dates/
 */
public class Solution {

    public int daysBetweenDates(String date1, String date2) {
        DateInfo d10 = new DateInfo(date1);
        DateInfo d20 = new DateInfo(date2);
        return Math.abs(d10.toInt() - d20.toInt());
    }

    private static class DateInfo {
        private static final int[] MONTH_LENGTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        public int year;
        public int month;
        public int day;

        public DateInfo(String date) {
            String[] arr = date.split("-");
            year = Integer.parseInt(arr[0]);
            month = Integer.parseInt(arr[1]);
            day = Integer.parseInt(arr[2]);
        }

        private boolean leapYear(int year) {
            return ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0));
        }

        public int toInt() {
            int ans = day - 1;
            while (month != 0) {
                --month;
                ans += MONTH_LENGTH[month];
                if (month == 2 && leapYear(year)) {
                    ans += 1;
                }
            }
            ans += 365 * (year - 1971);
            ans += (year - 1) / 4 - 1971 / 4;
            ans -= (year - 1) / 100 - 1971 / 100;
            ans += (year - 1) / 400 - 1971 / 400;
            return ans;
        }
    }
}
