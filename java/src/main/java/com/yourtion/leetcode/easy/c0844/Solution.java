package com.yourtion.leetcode.easy.c0844;

/**
 * 844. 比较含退格的字符串
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/backspace-string-compare/
 */
public class Solution {
    private String backspace(String str) {
        char[] arr = str.toCharArray();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '#') {
                index = index > 1 ? index - 1 : 0;
            } else {
                arr[index++] = arr[i];
            }
        }
        return new String(arr).substring(0, index);
    }

    public boolean backspaceCompare(String S, String T) {
        return backspace(S).equals(backspace(T));
    }
}
