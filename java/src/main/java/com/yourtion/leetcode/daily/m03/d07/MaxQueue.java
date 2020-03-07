package com.yourtion.leetcode.daily.m03.d07;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 面试题59 - II. 队列的最大值
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/
 */
public class MaxQueue {
    private Queue<Integer> queue;

    public MaxQueue() {
        queue = new LinkedList<>();
    }

    public int max_value() {
        int ret = -1;
        for (int i : queue) {
            ret = Math.max(ret, i);
        }
        return ret;
    }

    public void push_back(int value) {
        queue.add(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.poll();
    }
}
