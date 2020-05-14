package com.yourtion.leetcode.easy.c9015;

import java.util.Stack;

/**
 * 9015. 面试题 03.02. 栈的最小值
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/min-stack-lcci/
 */
public class MinStack {
    Stack<Integer> store = new Stack<>();
    Stack<Integer> minStore = new Stack<>();

    /**
     * initialize your data structure here.
     */
    public MinStack() {

    }

    public void push(int x) {
        store.push(x);
        if (minStore.isEmpty() || x < minStore.peek()) {
            minStore.push(x);
        } else {
            minStore.push(minStore.peek());
        }
    }

    public void pop() {
        store.pop();
        minStore.pop();
    }

    public int top() {
        return store.peek();
    }

    public int getMin() {
        return minStore.peek();
    }
}
