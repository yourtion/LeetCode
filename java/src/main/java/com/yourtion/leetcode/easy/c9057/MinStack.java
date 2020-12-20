package com.yourtion.leetcode.easy.c9057;

import java.util.Stack;

/**
 * 9057. 面试题30. 包含min函数的栈
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/
 */
public class MinStack {
    private final Stack<Integer> stack;
    private final Stack<Integer> min;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (min.isEmpty() || x <= min.peek()) {
            min.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        int ret = stack.pop();
        if (!min.isEmpty() && ret == min.peek()) {
            min.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min.peek();
    }
}
