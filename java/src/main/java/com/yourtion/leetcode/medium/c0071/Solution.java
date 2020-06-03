package com.yourtion.leetcode.medium.c0071;

import java.util.Stack;

/**
 * 71. 简化路径
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/simplify-path/
 */
public class Solution {
    public String simplifyPath(String path) {
        String[] split = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String s : split) {
            if (".".equals(s) || "".equals(s)) {
                continue;
            }
            if ("..".equals(s)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                continue;
            }
            stack.push(s);
        }
        StringBuilder sb = new StringBuilder();
        for (String s : stack) {
            sb.append("/");
            sb.append(s);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
