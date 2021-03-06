package com.yourtion.leetcode.daily.m08.d30;

/**
 * 557. 反转字符串中的单词 III
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 */
public class Solution {
    private char[] reverse(char[] data) {
        for (int left = 0, right = data.length - 1; left < right; left++, right--) {
            // swap the values at the left and right indices
            char temp = data[left];
            data[left] = data[right];
            data[right] = temp;
        }
        return data;
    }

    public String reverseWords(String s) {
        String[] strings = s.split("\\s");
        String[] ret = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = String.valueOf(reverse(strings[i].toCharArray()));
        }
        return String.join(" ", strings);
    }
}
