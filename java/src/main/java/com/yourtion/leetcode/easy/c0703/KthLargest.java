package com.yourtion.leetcode.easy.c0703;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 703. 数据流中的第K大元素
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/
 */
public class KthLargest {
    private Queue<Integer> pq = new PriorityQueue<>();
    private int max = 0;

    public KthLargest(int k, int[] nums) {
        max = k;
        for (int n : nums) {
            this.add(n);
        }
    }

    public int add(int val) {
        if (pq.size() < max) {
            pq.offer(val);
        } else if (val > pq.peek()) {
            pq.poll();
            pq.offer(val);
        }
        return pq.peek();
    }
}
