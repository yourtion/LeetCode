package com.yourtion.leetcode.easy.c0925;

/**
 * 925. 长按键入
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/long-pressed-name/
 */
public class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int a = 0;
        int b = 0;
        while (a < name.length() || b < typed.length()) {
            if (a < name.length() && b < typed.length() && name.charAt(a) == typed.charAt(b)) {
                a++;
                b++;
                continue;
            }
            if (b < typed.length() && a > 0 && name.charAt(a - 1) == typed.charAt(b)) {
                b++;
                continue;
            }
            return false;
        }
        return true;
    }
}
