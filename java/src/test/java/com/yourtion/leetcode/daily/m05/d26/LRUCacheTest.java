package com.yourtion.leetcode.daily.m05.d26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("每日一题 - 20200525")
class LRUCacheTest {

    @Test
    void testLRU() {
        System.out.println("runTest: LRUCache");
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        Assertions.assertEquals(1, cache.get(1));       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        Assertions.assertEquals(-1, cache.get(2));       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        Assertions.assertEquals(-1, cache.get(1));       // 返回 -1 (未找到)
        Assertions.assertEquals(3, cache.get(3));       // 返回  3
        Assertions.assertEquals(4, cache.get(4));       // 返回  4
    }
}