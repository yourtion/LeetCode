package com.yourtion.leetcode.easy.c0020;

import java.util.Stack;

/**
 * 20. 有效的括号
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/valid-parentheses
 */
public class Solution {
    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        char c1 = '(';
        char c2 = ')';
        char c3 = '[';
        char c4 = ']';
        char c5 = '{';
        char c6 = '}';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c1 || s.charAt(i) == c3 || s.charAt(i) == c5) {
                stack.push(s.charAt(i));
            } else if (stack.isEmpty()) {
                return false;
            } else {
                if (s.charAt(i) == c2 && c1 == stack.peek()) {
                    stack.pop();
                    continue;
                }
                if (s.charAt(i) == c4 && c3 == stack.peek()) {
                    stack.pop();
                    continue;
                }
                if (s.charAt(i) == c6 && c5 == stack.peek()) {
                    stack.pop();
                    continue;
                }
                return false;
            }
        }
        return stack.empty();
    }
}
