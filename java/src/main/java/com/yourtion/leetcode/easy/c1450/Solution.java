package com.yourtion.leetcode.easy.c1450;

/**
 * 1450. 在既定时间做作业的学生人数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/number-of-students-doing-homework-at-a-given-time/
 */
public class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int ret = 0;
        for (int i = 0; i < endTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                ret += 1;
            }
        }
        return ret;
    }
}
