package com.yourtion.leetcode.easy.c0706;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.List;

/**
 * 706. 设计哈希映射
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/design-hashmap/
 */
public class MyHashMap {
    private static int TableSize = 997;
    private List<Pair<Integer, Integer>>[] table = new LinkedList[TableSize];

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        for (int i = 0; i < TableSize; i++) {
            table[i] = new LinkedList<>();
        }
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        int bucket = key % TableSize;
        this.remove(key);
        table[bucket].add(new Pair<>(key, value));
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        int bucket = key % TableSize;
        for (Pair<Integer, Integer> n : table[bucket]) {
            if (n.getKey() == key) {
                return n.getValue();
            }
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        int bucket = key % TableSize;
        table[bucket].removeIf(n -> n.getKey() == key);
    }
}
