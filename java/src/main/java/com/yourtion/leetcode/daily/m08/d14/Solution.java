package com.yourtion.leetcode.daily.m08.d14;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20. 有效的括号
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/valid-parentheses/
 */
public class Solution {
    private static final Map<Character, Character> MAP;

    static {
        MAP = new HashMap<>();
        MAP.put(')', '(');
        MAP.put(']', '[');
        MAP.put('}', '{');
    }

    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (MAP.containsValue(c)) {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else if (MAP.get(c).equals(stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}
