package com.yourtion.leetcode.easy.c0155;

import java.util.Stack;

/**
 * 155. 最小栈
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/min-stack/
 */
public class MinStack {
    private int min;
    private int minCount;
    private Stack<Integer> stack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        minCount = 0;
        min = Integer.MAX_VALUE;
    }

    private void putMin(int x) {
        if (x < min) {
            min = x;
            minCount = 0;
        }
        if (x == min) {
            minCount += 1;
        }
    }

    public void push(int x) {
        this.stack.push(x);
        putMin(x);
    }

    public void pop() {
        int i = stack.pop();
        if (i == min) {
            if (minCount > 1) {
                minCount -= 1;
                return;
            }
            min = Integer.MAX_VALUE;
            for (int x : stack) {
                putMin(x);
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return this.min;
    }
}
