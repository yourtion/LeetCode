package com.yourtion.leetcode.easy.c9044;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("面试题09. 用两个栈实现队列")
class CQueueTest {

    @Test
    void testCQueue1() {
        System.out.println("runTest: testCQueue1");
        CQueue q = new CQueue();
        q.appendTail(3);
        Assertions.assertEquals(3, q.deleteHead());
        Assertions.assertEquals(-1, q.deleteHead());
    }

    @Test
    void testCQueue2() {
        System.out.println("runTest: testCQueue2");
        CQueue q = new CQueue();
        q.appendTail(3);
        q.appendTail(2);
        q.appendTail(1);
        Assertions.assertEquals(3, q.deleteHead());
        q.appendTail(4);
        q.appendTail(5);
        Assertions.assertEquals(2, q.deleteHead());
        Assertions.assertEquals(1, q.deleteHead());
        Assertions.assertEquals(4, q.deleteHead());
        Assertions.assertEquals(5, q.deleteHead());
        Assertions.assertEquals(-1, q.deleteHead());
    }

}