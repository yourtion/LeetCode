package com.yourtion.leetcode.easy.c1221;

import java.util.Stack;

/**
 * 1221. 分割平衡字符串
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 */
public class Solution {
    public int balancedStringSplit(String s) {
        int ret = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() == c) {
                stack.add(c);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    ret += 1;
                }
            }
        }
        return ret;
    }
}
