package com.yourtion.leetcode.daily.m10.d31;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("每日一题 - 20201031")
class RandomizedCollectionTest {

    @Test
    void test() {
        // 初始化一个空的集合。
        RandomizedCollection collection = new RandomizedCollection();
        // 向集合中插入 1 。返回 true 表示集合不包含 1 。
        Assertions.assertTrue(collection.insert(1));
        // 向集合中插入另一个 1 。返回 false 表示集合包含 1 。集合现在包含 [1,1] 。
        Assertions.assertFalse(collection.insert(1));
        // 向集合中插入 2 ，返回 true 。集合现在包含 [1,1,2] 。
        Assertions.assertTrue(collection.insert(2));
        // getRandom 应当有 2/3 的概率返回 1 ，1/3 的概率返回 2 。
        collection.getRandom();
        // 从集合中删除 1 ，返回 true 。集合现在包含 [1,2] 。
        Assertions.assertTrue(collection.remove(1));
        // getRandom 应有相同概率返回 1 和 2 。
        collection.getRandom();
    }

}