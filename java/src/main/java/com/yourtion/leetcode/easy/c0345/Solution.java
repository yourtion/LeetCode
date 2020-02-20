package com.yourtion.leetcode.easy.c0345;

/**
 * 345. 反转字符串中的元音字母
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/reverse-vowels-of-a-string/
 */
public class Solution {
    private boolean isNotVowels(char c) {
        return c != 'a' && c != 'e' && c != 'i' && c != 'u' && c != 'o' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U';
    }

    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;
        while (i < j) {
            if (isNotVowels(c[i])) {
                i++;
                continue;
            }
            if (isNotVowels(c[j])) {
                j--;
                continue;
            }
            if (c[i] != c[j]) {
                char a = c[i];
                c[i] = c[j];
                c[j] = a;
            }
            i++;
            j--;
        }
        return String.valueOf(c);
    }
}
