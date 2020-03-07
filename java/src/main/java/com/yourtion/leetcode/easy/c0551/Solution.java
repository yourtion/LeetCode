package com.yourtion.leetcode.easy.c0551;

/**
 * 551. 学生出勤记录 I
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/student-attendance-record-i/
 */
public class Solution {
    public boolean checkRecord(String s) {
        char[] arr = s.toCharArray();
        int a = 0;
        int l = 0;

        for (char c : arr) {
            if (c == 'A') {
                a += 1;
            }
            l = c == 'L' ? l + 1 : 0;
            if (a > 1 || l > 2) {
                return false;
            }
        }
        return true;
    }
}
