package com.yourtion.leetcode.daily.m05.d12;

import java.util.Stack;

/**
 * 155. 最小栈
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/min-stack/submissions/
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
