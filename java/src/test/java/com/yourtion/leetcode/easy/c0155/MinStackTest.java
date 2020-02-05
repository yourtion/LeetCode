package com.yourtion.leetcode.easy.c0155;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackTest {

    @Test
    void test1() {
        int res;
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        res = minStack.getMin();
        assertEquals(-3, res);
        minStack.pop();
        res = minStack.top();
        assertEquals(0, res);
        res = minStack.getMin();
        assertEquals(-2, res);
    }

    @Test
    void test2() {
        int res;
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.push(-3);
        res = minStack.getMin();
        assertEquals(-3, res);
        minStack.pop();
        res = minStack.top();
        assertEquals(-3, res);
        res = minStack.getMin();
        assertEquals(-3, res);
        minStack.pop();
        res = minStack.getMin();
        assertEquals(-2, res);
    }

}