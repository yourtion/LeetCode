package com.yourtion.leetcode.easy.c0038;

/**
 * 38. 外观数列
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/count-and-say/
 */
public class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int c = 1;
            char ss = s.charAt(0);
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == ss) {
                    c += 1;
                } else {
                    sb.append(c);
                    sb.append(ss);
                    ss = s.charAt(j);
                    c = 1;
                }
            }
            sb.append(c);
            sb.append(ss);
            s = sb.toString();
        }
        return s;
    }
}