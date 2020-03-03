package com.yourtion.leetcode.easy.c0500;

/**
 * 500. 键盘行
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/keyboard-row/
 */
public class Solution {
    private static final String[] LIST = "qwertyuiop,asdfghjkl,zxcvbnm".split(",");

    String getKeyboardLine(String c) {
        for (String l : LIST) {
            if (l.contains(c)) {
                return l;
            }
        }
        return "";
    }

    public String[] findWords(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            String[] s = w.toLowerCase().split("");
            String key = getKeyboardLine(s[0]);
            for (int i = 0; i < s.length; i++) {
                if (!key.contains(s[i])) {
                    break;
                }
                if (i == s.length - 1) {
                    sb.append(w).append(",");
                }
            }
        }
        return sb.length() == 0 ? new String[0] : sb.toString().split(",");
    }
}
