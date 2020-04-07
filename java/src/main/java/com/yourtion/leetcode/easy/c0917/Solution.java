package com.yourtion.leetcode.easy.c0917;

/**
 * 917. 仅仅反转字母
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/reverse-only-letters/
 */
public class Solution {
    public String reverseOnlyLetters(String S) {
        char[] ss = S.toCharArray();
        int a = 0;
        int b = ss.length - 1;
        while (a < b) {
            if (!Character.isLetter(ss[a])) {
                a++;
                continue;
            }
            if (!Character.isLetter(ss[b])) {
                b--;
                continue;
            }
            char tmp = ss[a];
            ss[a++] = ss[b];
            ss[b--] = tmp;
        }
        return new String(ss);
    }
}
