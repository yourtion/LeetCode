package com.yourtion.leetcode.daily.m04.d05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("每日一题 - 20200405")
class LFUCacheTest {

    @Test
    void test1() {
        LFUCache cache = new LFUCache(2 /* capacity (缓存容量) */);

        cache.put(1, 1);
        cache.put(2, 2);
        Assertions.assertEquals(1, cache.get(1));       // 返回 1
        cache.put(3, 3);    // 去除 key 2
        Assertions.assertEquals(-1, cache.get(2));       // 返回 -1 (未找到key 2)
        Assertions.assertEquals(3, cache.get(3));       // 返回 3
        cache.put(4, 4);    // 去除 key 1
        Assertions.assertEquals(-1, cache.get(1));       // 返回 -1 (未找到 key 1)
        Assertions.assertEquals(3, cache.get(3));       // 返回 3
        Assertions.assertEquals(4, cache.get(4));       // 返回 4
    }
}