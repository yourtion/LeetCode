package com.yourtion.leetcode.easy.c0225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 225. 用队列实现栈
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/implement-stack-using-queues/
 */
public class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    private boolean useQueue1;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
        useQueue1 = true;
    }

    private Queue<Integer> getQueue() {
        return useQueue1 ? queue1 : queue2;
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        Queue<Integer> oldQueue = useQueue1 ? queue1 : queue2;
        Queue<Integer> newQueue = useQueue1 ? queue2 : queue1;
        newQueue.clear();
        newQueue.add(x);
        while (!oldQueue.isEmpty()) {
            newQueue.add(oldQueue.remove());
        }
        useQueue1 = !useQueue1;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return this.getQueue().remove();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return this.getQueue().peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return this.getQueue().isEmpty();
    }
}
