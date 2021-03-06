package com.yourtion.leetcode.easy.c9044;

import java.util.Stack;

/**
 * 9044. 面试题09. 用两个栈实现队列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 */
public class CQueue {
    private Stack<Integer> stack;
    private Stack<Integer> tmp;

    public CQueue() {
        stack = new Stack<>();
        tmp = new Stack<>();
    }

    public void appendTail(int value) {
        while (!stack.isEmpty()) {
            tmp.add(stack.pop());
        }
        tmp.add(value);
    }

    public int deleteHead() {
        if (stack.isEmpty() && tmp.isEmpty()) {
            return -1;
        }
        while (!tmp.isEmpty()) {
            stack.add(tmp.pop());
        }
        return stack.pop();
    }
}
