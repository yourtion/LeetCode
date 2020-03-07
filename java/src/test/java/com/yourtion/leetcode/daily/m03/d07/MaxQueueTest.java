package com.yourtion.leetcode.daily.m03.d07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxQueueTest {

    @Test
    void queue1() {
        System.out.println("MaxQueueTest1");

        MaxQueue obj = new MaxQueue();
        obj.push_back(1);
        obj.push_back(2);
        Assertions.assertEquals(2, obj.max_value(), "max_value: 2");
        Assertions.assertEquals(1, obj.pop_front(), "pop_front: 1");
        Assertions.assertEquals(2, obj.max_value(), "max_value: 2");
    }

    @Test
    void queue2() {
        System.out.println("MaxQueueTest2");

        MaxQueue obj = new MaxQueue();
        Assertions.assertEquals(-1, obj.pop_front(), "pop_front: -1");
        Assertions.assertEquals(-1, obj.max_value(), "max_value: -1");
    }

}