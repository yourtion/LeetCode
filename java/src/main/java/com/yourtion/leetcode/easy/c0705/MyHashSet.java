package com.yourtion.leetcode.easy.c0705;

import java.util.LinkedList;
import java.util.List;

/**
 * 705. 设计哈希集合
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/design-hashset/
 */
public class MyHashSet {
    private static int TableSize = 997;
    private List<Integer>[] table = new LinkedList[TableSize];

    public MyHashSet() {
        for (int i = 0; i < TableSize; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void add(int key) {
        int bucket = key % TableSize;
        for (int n : table[bucket]) {
            if (n == key) {
                return;
            }
        }
        table[bucket].add(key);
    }

    public void remove(int key) {
        int bucket = key % TableSize;
        table[bucket].remove(Integer.valueOf(key));
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        int bucket = key % TableSize;
        return table[bucket].contains(key);
    }
}
