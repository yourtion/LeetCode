package com.yourtion.leetcode.daily.m04.d05;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 460. LFU缓存
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/lfu-cache/
 */
public class LFUCache {
    Map<Integer, Node> cache;
    Queue<Node> queue;
    int capacity;
    int size;
    int idx = 0;

    public LFUCache(int capacity) {
        cache = new HashMap<>(capacity);
        if (capacity > 0) {
            queue = new PriorityQueue<>(capacity);
        }
        this.capacity = capacity;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }
        node.freq++;
        node.idx = idx++;
        queue.remove(node);
        queue.offer(node);
        return node.value;

    }

    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }
        Node node = cache.get(key);
        if (node != null) {
            node.value = value;
            node.freq++;
            node.idx = idx++;
            queue.remove(node);
            queue.offer(node);
        } else {
            if (size == capacity && !queue.isEmpty()) {
                cache.remove(queue.peek().key);
                queue.poll();
                size--;
            }
            Node newNode = new Node(key, value, idx++);
            cache.put(key, newNode);
            queue.offer(newNode);
            size++;
        }
    }
}

class Node implements Comparable<Node> {
    int key;
    int value;
    int freq;
    int idx;

    public Node(int key, int value, int idx) {
        this.key = key;
        this.value = value;
        freq = 1;
        this.idx = idx;
    }

    @Override
    public int compareTo(Node node) {
        int diff = freq - node.freq;
        return diff != 0 ? diff : idx - node.idx;
    }
}
