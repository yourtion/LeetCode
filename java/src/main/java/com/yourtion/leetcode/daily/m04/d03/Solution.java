package com.yourtion.leetcode.daily.m04.d03;

/**
 * 8. 字符串转换整数 (atoi)
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/string-to-integer-atoi/
 */
public class Solution {
    public int myAtoi(String str) {
        char[] ss = str.toCharArray();
        int ret = 0;
        boolean isN = false;
        boolean start = false;
        for (char a : ss) {
            if (!start) {
                if (a == ' ') {
                    continue;
                }
                if (a == '-' || a == '+') {
                    isN = a == '-';
                    start = true;
                    continue;
                }
            }
            start = true;
            if (a >= '0' && a <= '9') {
                if (ret >= Integer.MAX_VALUE / 10) {
                    if (ret == Integer.MAX_VALUE / 10 && a - '0' <= 7) {
                        ret = ret * 10 + a - '0';
                        break;
                    }
                    return isN ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                ret = ret * 10 + a - '0';
                continue;
            }
            return isN ? ret * -1 : ret;
        }
        return isN ? ret * -1 : ret;
    }
}
