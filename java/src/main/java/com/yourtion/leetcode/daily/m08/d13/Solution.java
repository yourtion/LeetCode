package com.yourtion.leetcode.daily.m08.d13;

/**
 * 43. 字符串相乘
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/multiply-strings/
 */
public class Solution {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        if (num1.length() < num2.length()) {
            return multiply(num2, num1);
        }
        char[] n1s = num1.toCharArray();
        char[] n2s = num2.toCharArray();
        StringBuilder ret = new StringBuilder();
        for (int i = n2s.length - 1; i >= 0; i--) {
            StringBuilder sb = new StringBuilder();
            int add = 0;
            int a = n2s[i] - '0';
            // 计算当前位数
            int k = n2s.length - i - 1;
            // 填充当前低位数元素（之前结果）
            for (int j = 0; j < k; j++) {
                sb.append(ret.charAt(j));
            }
            for (int j = n1s.length - 1; j >= 0; j--) {
                // 当前待计算数
                int b = n1s[j] - '0';
                // 之前结果当前位数字（超过取0）
                int d = k >= ret.length() ? 0 : ret.charAt(k++) - '0';
                // 计算当前位结果
                int c = a * b + add + d;
                // 获取进位情况
                add = c / 10;
                sb.append(c % 10);
            }
            if (add > 0) {
                sb.append(add);
            }
            // 存储当前结果
            ret = sb;
        }
        return ret.reverse().toString();
    }
}
