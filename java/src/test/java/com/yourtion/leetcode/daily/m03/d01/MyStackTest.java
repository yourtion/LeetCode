package com.yourtion.leetcode.daily.m03.d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("每日一题 - 2020030")
class MyStackTest {

    @Test
    void test1() {
        System.out.println("run test for MyStack");
        MyStack stack = new MyStack();
        Assertions.assertTrue(stack.empty());
        stack.push(1);
        Assertions.assertEquals(1, stack.top());
        stack.push(2);
        Assertions.assertEquals(2, stack.top());
        stack.push(3);
        Assertions.assertEquals(3, stack.top());
        Assertions.assertEquals(3, stack.pop());
        Assertions.assertEquals(2, stack.pop());
        Assertions.assertEquals(1, stack.pop());
        Assertions.assertTrue(stack.empty());
    }

}