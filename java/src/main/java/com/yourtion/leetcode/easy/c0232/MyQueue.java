package com.yourtion.leetcode.easy.c0232;

import java.util.Stack;

/**
 * 232. 用栈实现队列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/implement-queue-using-stacks/
 */
public class MyQueue {
    private Stack<Integer> stack;
    private Stack<Integer> tmp;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack = new Stack<>();
        tmp = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        while (!stack.empty()) {
            tmp.push(stack.pop());
        }
        stack.push(x);
        while (!tmp.empty()) {
            stack.push(tmp.pop());
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        return stack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return stack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack.empty();
    }
}
