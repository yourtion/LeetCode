package com.yourtion.leetcode.easy.c0013;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. 罗马数字转整数
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/roman-to-integer/
 */
public class Solution {
    private static final Map<String, Integer> SPECIAL = new HashMap<String, Integer>() {{
        put("IV", 4);
        put("IX", 9);
        put("XL", 40);
        put("XC", 90);
        put("CD", 400);
        put("CM", 900);
    }};
    private static final Map<String, Integer> NORMAL = new HashMap<String, Integer>() {{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};

    public int romanToInt(String s) {
        int res = 0;
        for (String k : SPECIAL.keySet()) {
            if (s.contains(k)) {
                res += SPECIAL.get(k);
                s = s.replace(k, "");
            }
            if (s.isEmpty()) {
                return res;
            }
        }
        String[] arr = s.split("");
        for (String a : arr) {
            if (NORMAL.get(a) != null) {
                res += NORMAL.get(a);
            }
        }
        return res;
    }
}