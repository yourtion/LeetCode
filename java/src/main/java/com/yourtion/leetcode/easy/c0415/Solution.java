package com.yourtion.leetcode.easy.c0415;

/**
 * 415. 字符串相加
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/add-strings/
 */
public class Solution {
    public String addStrings(String num1, String num2) {
        if (num2.length() > num1.length()) {
            return addStrings(num2, num1);
        }
        StringBuilder sb = new StringBuilder();
        boolean carry = false;
        char[] num1Arr = num1.toCharArray();
        char[] num2Arr = num2.toCharArray();
        int i1 = num1Arr.length - 1;
        int i2 = num2Arr.length - 1;
        while (i1 >= 0) {
            int ret = num1Arr[i1] - '0';
            if (i2 >= 0) {
                ret += num2Arr[i2] - '0';
                i2 -= 1;
            }
            ret += carry ? 1 : 0;
            if (ret >= 10) {
                ret -= 10;
                carry = true;
            } else {
                carry = false;
            }
            i1 -= 1;
            sb.insert(0, ret);
        }
        if (carry) {
            sb.insert(0, 1);
        }
        return sb.toString();
    }
}
