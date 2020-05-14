package com.yourtion.leetcode.easy.c9016;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("面试题 03.04. 化栈为队")
class MyQueueTest {

    @Test
    void testMyQueue() {
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