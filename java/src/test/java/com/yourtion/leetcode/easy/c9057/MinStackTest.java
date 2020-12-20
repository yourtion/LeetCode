package com.yourtion.leetcode.easy.c9057;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("面试题30. 包含min函数的栈")
class MinStackTest {

    @Test
    void testMinStack() {
        System.out.println("runTest: testMinStack");
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        // 返回 -3.
        Assertions.assertEquals(-3, minStack.min());
        minStack.push(-3);
        Assertions.assertEquals(-3, minStack.min());
        minStack.pop();
        Assertions.assertEquals(-3, minStack.min());
        minStack.pop();
        // 返回 0.
        Assertions.assertEquals(0, minStack.top());
        // 返回 -2.
        Assertions.assertEquals(-2, minStack.min());
    }
}