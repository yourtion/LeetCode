package com.yourtion.leetcode.daily.m10.d31;

import java.util.*;

/**
 * 381. O(1) 时间插入、删除和获取随机元素 - 允许重复
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/insert-delete-getrandom-o1-duplicates-allowed/
 */
public class RandomizedCollection {
    Map<Integer, Set<Integer>> idx;
    List<Integer> items;

    /**
     * Initialize your data structure here.
     */
    public RandomizedCollection() {
        idx = new HashMap<>();
        items = new ArrayList<>();
    }

    /**
     * Inserts a value to the collection. Returns true if the collection did not already contain the specified element.
     */
    public boolean insert(int val) {
        items.add(val);
        Set<Integer> set = idx.getOrDefault(val, new HashSet<>());
        set.add(items.size() - 1);
        idx.put(val, set);
        return set.size() == 1;
    }

    /**
     * Removes a value from the collection. Returns true if the collection contained the specified element.
     */
    public boolean remove(int val) {
        if (!idx.containsKey(val)) {
            return false;
        }
        Iterator<Integer> it = idx.get(val).iterator();
        int i = it.next();
        int lastNum = items.get(items.size() - 1);
        items.set(i, lastNum);
        idx.get(val).remove(i);
        idx.get(lastNum).remove(items.size() - 1);
        if (i < items.size() - 1) {
            idx.get(lastNum).add(i);
        }
        if (idx.get(val).size() == 0) {
            idx.remove(val);
        }
        items.remove(items.size() - 1);
        return true;
    }

    /**
     * Get a random element from the collection.
     */
    public int getRandom() {
        return items.get((int) (Math.random() * items.size()));
    }
}
