package com.yourtion.leetcode.daily.m03.d12;

/**
 * 1071. 字符串的最大公因子
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/greatest-common-divisor-of-strings/
 */
public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String a = str1 + str2;
        String b = str2 + str1;
        if (!a.equals(b)) {
            return "";
        }
        return str1.substring(0, maxNumber(str1.length(), str2.length()));
    }

    int maxNumber(int m, int n) {
        int temp;
        if (n > m) {
            temp = n;
            n = m;
            m = temp;
        }
        if (m % n == 0) {
            return n;
        }
        return maxNumber(m - n, n);
    }
}
