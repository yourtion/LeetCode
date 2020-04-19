package com.yourtion.leetcode.easy.c1046;

import java.util.PriorityQueue;

/**
 * 1046. 最后一块石头的重量
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/last-stone-weight/
 */
public class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(stones.length, (o1, o2) -> o2 - o1);
        for (int s : stones) {
            q.add(s);
        }
        while (q.size() >= 2) {
            Integer head1 = q.poll();
            Integer head2 = q.isEmpty() ? 0 : q.poll();

            q.offer(head1 - head2);
        }
        return q.isEmpty() ? 0 : q.poll();
    }
}
