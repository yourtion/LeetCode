package com.yourtion.leetcode.easy.c0232;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyQueueTest {

    @Test
    void test1() {
        System.out.println("run test for MyQueue");
        MyQueue q = new MyQueue();
        Assertions.assertTrue(q.empty());
        q.push(1);
        Assertions.assertEquals(1, q.peek());
        q.push(2);
        Assertions.assertEquals(1, q.peek());
        q.push(3);
        Assertions.assertEquals(1, q.peek());
        Assertions.assertEquals(1, q.pop());
        Assertions.assertFalse(q.empty());
        Assertions.assertEquals(2, q.pop());
        Assertions.assertEquals(3, q.pop());
        Assertions.assertTrue(q.empty());
    }
}