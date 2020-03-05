package com.yourtion.leetcode.easy.c0520;

/**
 * 520. 检测大写字母
 *
 * @author Yourtion
 */
public class Solution {
    boolean isUp(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public boolean detectCapitalUse(String word) {
        if (word.toUpperCase().equals(word)) {
            return true;
        }
        if (word.toLowerCase().equals(word)) {
            return true;
        }
        char[] ws = word.toCharArray();
        boolean firstUp = isUp(ws[0]);
        for (int i = 1; i < ws.length; i++) {
            if (isUp(ws[i])) {
                return false;
            }
        }
        return firstUp;
    }
}
