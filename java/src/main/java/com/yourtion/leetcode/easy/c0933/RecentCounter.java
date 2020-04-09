package com.yourtion.leetcode.easy.c0933;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 933. 最近的请求次数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/number-of-recent-calls/
 */
public class RecentCounter {

    public static final int MAX_PING = 3000;
    Deque<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (!queue.isEmpty() && t - queue.peekFirst() > MAX_PING) {
            queue.pollFirst();
        }
        return queue.size();
    }
}
