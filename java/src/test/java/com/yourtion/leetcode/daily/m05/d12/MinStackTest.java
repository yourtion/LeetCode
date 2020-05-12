package com.yourtion.leetcode.daily.m05.d12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("每日一题 - 20200511")
class MinStackTest {

    @Test
    void testMinStack() {
        System.out.println("runTest: testMinStack");
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        // 返回 -3.
        Assertions.assertEquals(-3, minStack.getMin());
        minStack.pop();
        // 返回 0.
        Assertions.assertEquals(0, minStack.top());
        // 返回 -2.
        Assertions.assertEquals(-2, minStack.getMin());
    }

}