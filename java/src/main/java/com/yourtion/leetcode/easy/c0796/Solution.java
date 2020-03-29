package com.yourtion.leetcode.easy.c0796;

import java.util.Stack;

/**
 * 796. 旋转字符串
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/rotate-string/
 */
public class Solution {
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if (A.equals(B)) {
            return true;
        }
        Stack<Integer> indexes = new Stack<>();
        char[] aa = A.toCharArray();
        int i = 0;
        while (i < B.length()) {
            i = B.indexOf(aa[0], i + 1);
            if (i == -1) {
                break;
            } else {
                indexes.add(i);
            }
        }
        while (!indexes.empty()) {
            i = indexes.pop();
            boolean ok = true;
            for (char c : aa) {
                if (B.indexOf(c, i) != i) {
                    ok = false;
                    break;
                }
                i = i == B.length() - 1 ? 0 : i + 1;
            }
            if (ok) {
                return true;
            }
        }
        return false;
    }
}
