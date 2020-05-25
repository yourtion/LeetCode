package com.yourtion.leetcode.medium.c0012;

import javafx.util.Pair;

/**
 * 12. 整数转罗马数字
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/integer-to-roman/
 */
public class Solution {
    private Pair<Integer, String> conv(int num) {
        if (num >= 1000) {
            return new Pair<>(1000, "M");
        } else if (num >= 900) {
            return new Pair<>(900, "CM");
        } else if (num >= 500) {
            return new Pair<>(500, "D");
        } else if (num >= 400) {
            return new Pair<>(400, "CD");
        } else if (num >= 100) {
            return new Pair<>(100, "C");
        } else if (num >= 90) {
            return new Pair<>(90, "XC");
        } else if (num >= 50) {
            return new Pair<>(50, "L");
        } else if (num >= 40) {
            return new Pair<>(40, "XL");
        } else if (num >= 10) {
            return new Pair<>(10, "X");
        } else if (num >= 9) {
            return new Pair<>(10, "IX");
        } else if (num >= 5) {
            return new Pair<>(5, "V");
        } else if (num >= 4) {
            return new Pair<>(4, "IV");
        }
        return new Pair<>(1, "I");
    }

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            Pair<Integer, String> r = conv(num);
            num -= r.getKey();
            sb.append(r.getValue());
        }
        return sb.toString();
    }
}
