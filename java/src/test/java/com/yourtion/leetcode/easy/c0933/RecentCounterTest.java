package com.yourtion.leetcode.easy.c0933;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RecentCounterTest {

    @Test
    void testRecentCounter() {
        System.out.println("testRecentCounter");
        RecentCounter obj = new RecentCounter();
        Assertions.assertEquals(1, obj.ping(1));
        Assertions.assertEquals(2, obj.ping(100));
        Assertions.assertEquals(3, obj.ping(3001));
        Assertions.assertEquals(3, obj.ping(3002));
    }

}